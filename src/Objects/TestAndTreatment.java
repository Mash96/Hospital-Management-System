/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author maneesha
 */
@Entity
@Table(name = "test and treatment", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "TestAndTreatment.findAll", query = "SELECT t FROM TestAndTreatment t"),
    @NamedQuery(name = "TestAndTreatment.findById", query = "SELECT t FROM TestAndTreatment t WHERE t.id = :id"),
    @NamedQuery(name = "TestAndTreatment.findByName", query = "SELECT t FROM TestAndTreatment t WHERE t.name = :name"),
    @NamedQuery(name = "TestAndTreatment.findByTesttype", query = "SELECT t FROM TestAndTreatment t WHERE t.testtype = :testtype"),
    @NamedQuery(name = "TestAndTreatment.findByTreatmenttype", query = "SELECT t FROM TestAndTreatment t WHERE t.treatmenttype = :treatmenttype")})
public class TestAndTreatment implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "Test_type")
    private String testtype;
    @Column(name = "Treatment_type")
    private String treatmenttype;

    public TestAndTreatment() {
    }

    public TestAndTreatment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        String oldTesttype = this.testtype;
        this.testtype = testtype;
        changeSupport.firePropertyChange("testtype", oldTesttype, testtype);
    }

    public String getTreatmenttype() {
        return treatmenttype;
    }

    public void setTreatmenttype(String treatmenttype) {
        String oldTreatmenttype = this.treatmenttype;
        this.treatmenttype = treatmenttype;
        changeSupport.firePropertyChange("treatmenttype", oldTreatmenttype, treatmenttype);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestAndTreatment)) {
            return false;
        }
        TestAndTreatment other = (TestAndTreatment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.TestAndTreatment[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
