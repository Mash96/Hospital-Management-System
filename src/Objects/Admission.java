/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Objects.AdmissionPK;
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
@Table(name = "admission", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admission.findAll", query = "SELECT a FROM Admission a"),
    @NamedQuery(name = "Admission.findByAId", query = "SELECT a FROM Admission a WHERE a.admissionPK.aId = :aId"),
    @NamedQuery(name = "Admission.findBySickness", query = "SELECT a FROM Admission a WHERE a.sickness = :sickness"),
    @NamedQuery(name = "Admission.findByRecPhysicianDetails", query = "SELECT a FROM Admission a WHERE a.recPhysicianDetails = :recPhysicianDetails"),
    @NamedQuery(name = "Admission.findByAdmittedDate", query = "SELECT a FROM Admission a WHERE a.admittedDate = :admittedDate"),
    @NamedQuery(name = "Admission.findByDoctorid", query = "SELECT a FROM Admission a WHERE a.admissionPK.doctorid = :doctorid"),
    @NamedQuery(name = "Admission.findByDoctorid1", query = "SELECT a FROM Admission a WHERE a.admissionPK.doctorid1 = :doctorid1"),
    @NamedQuery(name = "Admission.findByPatientID", query = "SELECT a FROM Admission a WHERE a.admissionPK.patientID = :patientID"),
    @NamedQuery(name = "Admission.findByWardWid", query = "SELECT a FROM Admission a WHERE a.admissionPK.wardWid = :wardWid")})
public class Admission implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AdmissionPK admissionPK;
    @Column(name = "sickness")
    private String sickness;
    @Column(name = "recPhysicianDetails")
    private String recPhysicianDetails;
    @Column(name = "admittedDate")
    private String admittedDate;

    public Admission() {
    }

    public Admission(AdmissionPK admissionPK) {
        this.admissionPK = admissionPK;
    }

    public Admission(int aId, int doctorid, int doctorid1, int patientID, int wardWid) {
        this.admissionPK = new AdmissionPK(aId, doctorid, doctorid1, patientID, wardWid);
    }

    public AdmissionPK getAdmissionPK() {
        return admissionPK;
    }

    public void setAdmissionPK(AdmissionPK admissionPK) {
        this.admissionPK = admissionPK;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        String oldSickness = this.sickness;
        this.sickness = sickness;
        changeSupport.firePropertyChange("sickness", oldSickness, sickness);
    }

    public String getRecPhysicianDetails() {
        return recPhysicianDetails;
    }

    public void setRecPhysicianDetails(String recPhysicianDetails) {
        String oldRecPhysicianDetails = this.recPhysicianDetails;
        this.recPhysicianDetails = recPhysicianDetails;
        changeSupport.firePropertyChange("recPhysicianDetails", oldRecPhysicianDetails, recPhysicianDetails);
    }

    public String getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(String admittedDate) {
        String oldAdmittedDate = this.admittedDate;
        this.admittedDate = admittedDate;
        changeSupport.firePropertyChange("admittedDate", oldAdmittedDate, admittedDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (admissionPK != null ? admissionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admission)) {
            return false;
        }
        Admission other = (Admission) object;
        if ((this.admissionPK == null && other.admissionPK != null) || (this.admissionPK != null && !this.admissionPK.equals(other.admissionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "System.Admission[ admissionPK=" + admissionPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
