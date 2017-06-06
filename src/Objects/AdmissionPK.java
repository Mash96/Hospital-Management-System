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
public class AdmissionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "a_id")
    private int aId;
    @Basic(optional = false)
    @Column(name = "Doctor_id")
    private int doctorid;
    @Basic(optional = false)
    @Column(name = "Doctor_id1")
    private int doctorid1;
    @Basic(optional = false)
    @Column(name = "Patient_ID")
    private int patientID;
    @Basic(optional = false)
    @Column(name = "Ward_W_id")
    private int wardWid;

    public AdmissionPK() {
    }

    public AdmissionPK(int aId, int doctorid, int doctorid1, int patientID, int wardWid) {
        this.aId = aId;
        this.doctorid = doctorid;
        this.doctorid1 = doctorid1;
        this.patientID = patientID;
        this.wardWid = wardWid;
    }

    public int getAId() {
        return aId;
    }

    public void setAId(int aId) {
        this.aId = aId;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public int getDoctorid1() {
        return doctorid1;
    }

    public void setDoctorid1(int doctorid1) {
        this.doctorid1 = doctorid1;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getWardWid() {
        return wardWid;
    }

    public void setWardWid(int wardWid) {
        this.wardWid = wardWid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) aId;
        hash += (int) doctorid;
        hash += (int) doctorid1;
        hash += (int) patientID;
        hash += (int) wardWid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdmissionPK)) {
            return false;
        }
        AdmissionPK other = (AdmissionPK) object;
        if (this.aId != other.aId) {
            return false;
        }
        if (this.doctorid != other.doctorid) {
            return false;
        }
        if (this.doctorid1 != other.doctorid1) {
            return false;
        }
        if (this.patientID != other.patientID) {
            return false;
        }
        if (this.wardWid != other.wardWid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "System.AdmissionPK[ aId=" + aId + ", doctorid=" + doctorid + ", doctorid1=" + doctorid1 + ", patientID=" + patientID + ", wardWid=" + wardWid + " ]";
    }
    
}
