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
public class DoctorPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "Ward_W_id")
    private int wardWid;
    @Basic(optional = false)
    @Column(name = "Employee_ID")
    private int employeeID;

    public DoctorPK() {
    }

    public DoctorPK(int id, int wardWid, int employeeID) {
        this.id = id;
        this.wardWid = wardWid;
        this.employeeID = employeeID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWardWid() {
        return wardWid;
    }

    public void setWardWid(int wardWid) {
        this.wardWid = wardWid;
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
        hash += (int) wardWid;
        hash += (int) employeeID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorPK)) {
            return false;
        }
        DoctorPK other = (DoctorPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.wardWid != other.wardWid) {
            return false;
        }
        if (this.employeeID != other.employeeID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.DoctorPK[ id=" + id + ", wardWid=" + wardWid + ", employeeID=" + employeeID + " ]";
    }
    
}
