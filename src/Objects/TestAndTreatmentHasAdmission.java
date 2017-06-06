/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

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
@Table(name = "test and treatment_has_admission", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "TestAndTreatmentHasAdmission.findAll", query = "SELECT t FROM TestAndTreatmentHasAdmission t"),
    @NamedQuery(name = "TestAndTreatmentHasAdmission.findByTestandTreatmentid", query = "SELECT t FROM TestAndTreatmentHasAdmission t WHERE t.testAndTreatmentHasAdmissionPK.testandTreatmentid = :testandTreatmentid"),
    @NamedQuery(name = "TestAndTreatmentHasAdmission.findByAdmissionaid", query = "SELECT t FROM TestAndTreatmentHasAdmission t WHERE t.testAndTreatmentHasAdmissionPK.admissionaid = :admissionaid"),
    @NamedQuery(name = "TestAndTreatmentHasAdmission.findByTestResult", query = "SELECT t FROM TestAndTreatmentHasAdmission t WHERE t.testResult = :testResult"),
    @NamedQuery(name = "TestAndTreatmentHasAdmission.findByTreatmentResult", query = "SELECT t FROM TestAndTreatmentHasAdmission t WHERE t.treatmentResult = :treatmentResult"),
    @NamedQuery(name = "TestAndTreatmentHasAdmission.findByDate", query = "SELECT t FROM TestAndTreatmentHasAdmission t WHERE t.testAndTreatmentHasAdmissionPK.date = :date")})
public class TestAndTreatmentHasAdmission implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TestAndTreatmentHasAdmissionPK testAndTreatmentHasAdmissionPK;
    @Column(name = "Test_Result")
    private String testResult;
    @Column(name = "Treatment_Result")
    private String treatmentResult;

    public TestAndTreatmentHasAdmission() {
    }

    public TestAndTreatmentHasAdmission(TestAndTreatmentHasAdmissionPK testAndTreatmentHasAdmissionPK) {
        this.testAndTreatmentHasAdmissionPK = testAndTreatmentHasAdmissionPK;
    }

    public TestAndTreatmentHasAdmission(int testandTreatmentid, int admissionaid, String date) {
        this.testAndTreatmentHasAdmissionPK = new TestAndTreatmentHasAdmissionPK(testandTreatmentid, admissionaid, date);
    }

    public TestAndTreatmentHasAdmissionPK getTestAndTreatmentHasAdmissionPK() {
        return testAndTreatmentHasAdmissionPK;
    }

    public void setTestAndTreatmentHasAdmissionPK(TestAndTreatmentHasAdmissionPK testAndTreatmentHasAdmissionPK) {
        this.testAndTreatmentHasAdmissionPK = testAndTreatmentHasAdmissionPK;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        String oldTestResult = this.testResult;
        this.testResult = testResult;
        changeSupport.firePropertyChange("testResult", oldTestResult, testResult);
    }

    public String getTreatmentResult() {
        return treatmentResult;
    }

    public void setTreatmentResult(String treatmentResult) {
        String oldTreatmentResult = this.treatmentResult;
        this.treatmentResult = treatmentResult;
        changeSupport.firePropertyChange("treatmentResult", oldTreatmentResult, treatmentResult);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testAndTreatmentHasAdmissionPK != null ? testAndTreatmentHasAdmissionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestAndTreatmentHasAdmission)) {
            return false;
        }
        TestAndTreatmentHasAdmission other = (TestAndTreatmentHasAdmission) object;
        if ((this.testAndTreatmentHasAdmissionPK == null && other.testAndTreatmentHasAdmissionPK != null) || (this.testAndTreatmentHasAdmissionPK != null && !this.testAndTreatmentHasAdmissionPK.equals(other.testAndTreatmentHasAdmissionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.TestAndTreatmentHasAdmission[ testAndTreatmentHasAdmissionPK=" + testAndTreatmentHasAdmissionPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
