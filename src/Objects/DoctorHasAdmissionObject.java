/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author maneesha
 */
public class DoctorHasAdmissionObject {
    int doctorid;
    int admissionaid;
    String examineddate;
    String description;
    
    public DoctorHasAdmissionObject(){
        
    }
    
    public DoctorHasAdmissionObject(int doctorid, int admissionaid, String examineddate, String description){
        this.doctorid = doctorid;
        this.admissionaid = admissionaid;
        this.examineddate = examineddate;
        this.description = description;
    }
    
    public int getDoctorid(){
        return doctorid;
    }
    
    public void setDoctorid(int doctorid){
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
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        //String oldDescription = this.description;
        this.description = description;
       // changeSupport.firePropertyChange("description", oldDescription, description);
    }
    
    
    
    
}
