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
public class MaintenanceStaffPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "Employee_ID")
    private int employeeID;

    public MaintenanceStaffPK() {
    }

    public MaintenanceStaffPK(int id, int employeeID) {
        this.id = id;
        this.employeeID = employeeID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) employeeID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaintenanceStaffPK)) {
            return false;
        }
        MaintenanceStaffPK other = (MaintenanceStaffPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.employeeID != other.employeeID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.MaintenanceStaffPK[ id=" + id + ", employeeID=" + employeeID + " ]";
    }
    
}
