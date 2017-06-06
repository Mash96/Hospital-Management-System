/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Objects.NursePK;
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
@Table(name = "nurse", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "Nurse.findAll", query = "SELECT n FROM Nurse n"),
    @NamedQuery(name = "Nurse.findById", query = "SELECT n FROM Nurse n WHERE n.nursePK.id = :id"),
    @NamedQuery(name = "Nurse.findByPosition", query = "SELECT n FROM Nurse n WHERE n.position = :position"),
    @NamedQuery(name = "Nurse.findByEmployeeID", query = "SELECT n FROM Nurse n WHERE n.nursePK.employeeID = :employeeID")})
public class Nurse implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NursePK nursePK;
    @Column(name = "Position")
    private String position;

    public Nurse() {
    }

    public Nurse(NursePK nursePK) {
        this.nursePK = nursePK;
    }

    public Nurse(int id, int employeeID) {
        this.nursePK = new NursePK(id, employeeID);
    }

    public NursePK getNursePK() {
        return nursePK;
    }

    public void setNursePK(NursePK nursePK) {
        this.nursePK = nursePK;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nursePK != null ? nursePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nurse)) {
            return false;
        }
        Nurse other = (Nurse) object;
        if ((this.nursePK == null && other.nursePK != null) || (this.nursePK != null && !this.nursePK.equals(other.nursePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Nurse[ nursePK=" + nursePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
