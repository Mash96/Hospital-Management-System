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
@Table(name = "ward", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ward.findAll", query = "SELECT w FROM Ward w"),
    @NamedQuery(name = "Ward.findByWid", query = "SELECT w FROM Ward w WHERE w.wid = :wid"),
    @NamedQuery(name = "Ward.findByType", query = "SELECT w FROM Ward w WHERE w.type = :type"),
    @NamedQuery(name = "Ward.findByNumOfPatients", query = "SELECT w FROM Ward w WHERE w.numOfPatients = :numOfPatients")})
public class Ward implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "W_id")
    private Integer wid;
    @Column(name = "Type")
    private String type;
    @Column(name = "NumOfPatients")
    private Integer numOfPatients;

    public Ward() {
    }

    public Ward(Integer wid) {
        this.wid = wid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        Integer oldWid = this.wid;
        this.wid = wid;
        changeSupport.firePropertyChange("wid", oldWid, wid);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public Integer getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(Integer numOfPatients) {
        Integer oldNumOfPatients = this.numOfPatients;
        this.numOfPatients = numOfPatients;
        changeSupport.firePropertyChange("numOfPatients", oldNumOfPatients, numOfPatients);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wid != null ? wid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ward)) {
            return false;
        }
        Ward other = (Ward) object;
        if ((this.wid == null && other.wid != null) || (this.wid != null && !this.wid.equals(other.wid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Ward[ wid=" + wid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
