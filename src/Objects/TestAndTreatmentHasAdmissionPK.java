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
public class TestAndTreatmentHasAdmissionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Test_and_Treatment_id")
    private int testandTreatmentid;
    @Basic(optional = false)
    @Column(name = "Admission_a_id")
    private int admissionaid;
    @Basic(optional = false)
    @Column(name = "Date")
    private String date;

    public TestAndTreatmentHasAdmissionPK() {
    }

    public TestAndTreatmentHasAdmissionPK(int testandTreatmentid, int admissionaid, String date) {
        this.testandTreatmentid = testandTreatmentid;
        this.admissionaid = admissionaid;
        this.date = date;
    }

    public int getTestandTreatmentid() {
        return testandTreatmentid;
    }

    public void setTestandTreatmentid(int testandTreatmentid) {
        this.testandTreatmentid = testandTreatmentid;
    }

    public int getAdmissionaid() {
        return admissionaid;
    }

    public void setAdmissionaid(int admissionaid) {
        this.admissionaid = admissionaid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) testandTreatmentid;
        hash += (int) admissionaid;
        hash += (date != null ? date.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestAndTreatmentHasAdmissionPK)) {
            return false;
        }
        TestAndTreatmentHasAdmissionPK other = (TestAndTreatmentHasAdmissionPK) object;
        if (this.testandTreatmentid != other.testandTreatmentid) {
            return false;
        }
        if (this.admissionaid != other.admissionaid) {
            return false;
        }
        if ((this.date == null && other.date != null) || (this.date != null && !this.date.equals(other.date))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.TestAndTreatmentHasAdmissionPK[ testandTreatmentid=" + testandTreatmentid + ", admissionaid=" + admissionaid + ", date=" + date + " ]";
    }
    
}
