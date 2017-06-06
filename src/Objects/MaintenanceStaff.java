/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Objects.MaintenanceStaffPK;
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
@Table(name = "maintenance staff", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "MaintenanceStaff.findAll", query = "SELECT m FROM MaintenanceStaff m"),
    @NamedQuery(name = "MaintenanceStaff.findById", query = "SELECT m FROM MaintenanceStaff m WHERE m.maintenanceStaffPK.id = :id"),
    @NamedQuery(name = "MaintenanceStaff.findByPosition", query = "SELECT m FROM MaintenanceStaff m WHERE m.position = :position"),
    @NamedQuery(name = "MaintenanceStaff.findByEmployeeID", query = "SELECT m FROM MaintenanceStaff m WHERE m.maintenanceStaffPK.employeeID = :employeeID")})
public class MaintenanceStaff implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MaintenanceStaffPK maintenanceStaffPK;
    @Column(name = "Position")
    private String position;

    public MaintenanceStaff() {
    }

    public MaintenanceStaff(MaintenanceStaffPK maintenanceStaffPK) {
        this.maintenanceStaffPK = maintenanceStaffPK;
    }

    public MaintenanceStaff(int id, int employeeID) {
        this.maintenanceStaffPK = new MaintenanceStaffPK(id, employeeID);
    }

    public MaintenanceStaffPK getMaintenanceStaffPK() {
        return maintenanceStaffPK;
    }

    public void setMaintenanceStaffPK(MaintenanceStaffPK maintenanceStaffPK) {
        this.maintenanceStaffPK = maintenanceStaffPK;
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
        hash += (maintenanceStaffPK != null ? maintenanceStaffPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaintenanceStaff)) {
            return false;
        }
        MaintenanceStaff other = (MaintenanceStaff) object;
        if ((this.maintenanceStaffPK == null && other.maintenanceStaffPK != null) || (this.maintenanceStaffPK != null && !this.maintenanceStaffPK.equals(other.maintenanceStaffPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.MaintenanceStaff[ maintenanceStaffPK=" + maintenanceStaffPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
