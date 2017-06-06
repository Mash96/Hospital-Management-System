/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Objects.DoctorPK;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maneesha
 */
@Entity
@Table(name = "doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
    @NamedQuery(name = "Doctor.findById", query = "SELECT d FROM Doctor d WHERE d.doctorPK.id = :id"),
    @NamedQuery(name = "Doctor.findBySpeciality", query = "SELECT d FROM Doctor d WHERE d.speciality = :speciality"),
    @NamedQuery(name = "Doctor.findByQulifications", query = "SELECT d FROM Doctor d WHERE d.qulifications = :qulifications"),
    @NamedQuery(name = "Doctor.findByWardWid", query = "SELECT d FROM Doctor d WHERE d.doctorPK.wardWid = :wardWid"),
    @NamedQuery(name = "Doctor.findByEmployeeID", query = "SELECT d FROM Doctor d WHERE d.doctorPK.employeeID = :employeeID")})
public class Doctor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DoctorPK doctorPK;
    @Column(name = "Speciality")
    private String speciality;
    @Column(name = "Qulifications")
    private String qulifications;

    public Doctor() {
    }

    public Doctor(DoctorPK doctorPK) {
        this.doctorPK = doctorPK;
    }

    public Doctor(int id, int wardWid, int employeeID) {
        this.doctorPK = new DoctorPK(id, wardWid, employeeID);
    }

    public DoctorPK getDoctorPK() {
        return doctorPK;
    }

    public void setDoctorPK(DoctorPK doctorPK) {
        this.doctorPK = doctorPK;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        String oldSpeciality = this.speciality;
        this.speciality = speciality;
        changeSupport.firePropertyChange("speciality", oldSpeciality, speciality);
    }

    public String getQulifications() {
        return qulifications;
    }

    public void setQulifications(String qulifications) {
        String oldQulifications = this.qulifications;
        this.qulifications = qulifications;
        changeSupport.firePropertyChange("qulifications", oldQulifications, qulifications);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doctorPK != null ? doctorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.doctorPK == null && other.doctorPK != null) || (this.doctorPK != null && !this.doctorPK.equals(other.doctorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Doctor[ doctorPK=" + doctorPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
