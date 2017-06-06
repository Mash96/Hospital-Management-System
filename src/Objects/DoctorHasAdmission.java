/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Objects.DoctorHasAdmissionPK;
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

/**
 *
 * @author maneesha
 */
@Entity
@Table(name = "doctor_has_admission", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "DoctorHasAdmission.findAll", query = "SELECT d FROM DoctorHasAdmission d"),
    @NamedQuery(name = "DoctorHasAdmission.findByDoctorid", query = "SELECT d FROM DoctorHasAdmission d WHERE d.doctorHasAdmissionPK.doctorid = :doctorid"),
    @NamedQuery(name = "DoctorHasAdmission.findByAdmissionaid", query = "SELECT d FROM DoctorHasAdmission d WHERE d.doctorHasAdmissionPK.admissionaid = :admissionaid"),
    @NamedQuery(name = "DoctorHasAdmission.findByExamineddate", query = "SELECT d FROM DoctorHasAdmission d WHERE d.doctorHasAdmissionPK.examineddate = :examineddate"),
    @NamedQuery(name = "DoctorHasAdmission.findByDescription", query = "SELECT d FROM DoctorHasAdmission d WHERE d.description = :description")})
public class DoctorHasAdmission implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DoctorHasAdmissionPK doctorHasAdmissionPK;
    @Column(name = "Description")
    private String description;

    public DoctorHasAdmission() {
    }

    public DoctorHasAdmission(DoctorHasAdmissionPK doctorHasAdmissionPK) {
        this.doctorHasAdmissionPK = doctorHasAdmissionPK;
    }

    public DoctorHasAdmission(int doctorid, int admissionaid, String examineddate) {
        this.doctorHasAdmissionPK = new DoctorHasAdmissionPK(doctorid, admissionaid, examineddate);
    }

    public DoctorHasAdmissionPK getDoctorHasAdmissionPK() {
        return doctorHasAdmissionPK;
    }

    public void setDoctorHasAdmissionPK(DoctorHasAdmissionPK doctorHasAdmissionPK) {
        this.doctorHasAdmissionPK = doctorHasAdmissionPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doctorHasAdmissionPK != null ? doctorHasAdmissionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorHasAdmission)) {
            return false;
        }
        DoctorHasAdmission other = (DoctorHasAdmission) object;
        if ((this.doctorHasAdmissionPK == null && other.doctorHasAdmissionPK != null) || (this.doctorHasAdmissionPK != null && !this.doctorHasAdmissionPK.equals(other.doctorHasAdmissionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.DoctorHasAdmission[ doctorHasAdmissionPK=" + doctorHasAdmissionPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
