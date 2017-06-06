/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author maneesha
 */
@Embeddable
public class DoctorHasAdmissionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Doctor_id")
    private int doctorid;
    @Basic(optional = false)
    @Column(name = "Admission_a_id")
    private int admissionaid;
    @Basic(optional = false)
    @Column(name = "Examined_date")
    private String examineddate;

    public DoctorHasAdmissionPK() {
    }

    public DoctorHasAdmissionPK(int doctorid, int admissionaid, String examineddate) {
        this.doctorid = doctorid;
        this.admissionaid = admissionaid;
        this.examineddate = examineddate;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public int getAdmissionaid() {
        return admissionaid;
    }

    public void setAdmissionaid(int admissionaid) {
        this.admissionaid = admissionaid;
    }

    public String getExamineddate() {
        return examineddate;
    }

    public void setExamineddate(String examineddate) {
        this.examineddate = examineddate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) doctorid;
        hash += (int) admissionaid;
        hash += (examineddate != null ? examineddate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorHasAdmissionPK)) {
            return false;
        }
        DoctorHasAdmissionPK other = (DoctorHasAdmissionPK) object;
        if (this.doctorid != other.doctorid) {
            return false;
        }
        if (this.admissionaid != other.admissionaid) {
            return false;
        }
        if ((this.examineddate == null && other.examineddate != null) || (this.examineddate != null && !this.examineddate.equals(other.examineddate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.DoctorHasAdmissionPK[ doctorid=" + doctorid + ", admissionaid=" + admissionaid + ", examineddate=" + examineddate + " ]";
    }
    
}
