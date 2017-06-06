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
public class AdmissionObject {
    
    int aid;
    String sickness;
    String recphysiciandetails;
    String admitteddate;
    int doctorid;
    int doctorid1;
    int patientid;
    int wardwid;
    
    public AdmissionObject(){
        
    }
    
    public AdmissionObject(int aid, String sickness, String recphysiciandetails, String admitteddate,int doctorid, int doctorid1,int patientid,int wardwid){
        this.aid = aid;
        this.sickness = sickness;
        this.recphysiciandetails = recphysiciandetails;
        this.admitteddate = admitteddate;
        this.doctorid = doctorid;
        this.doctorid1 = doctorid1;
        this.patientid = patientid;
        this.wardwid = wardwid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public String getRecphysiciandetails() {
        return recphysiciandetails;
    }

    public void setRecphysiciandetails(String recphysiciandetails) {
        this.recphysiciandetails = recphysiciandetails;
    }

    public String getAdmitteddate() {
        return admitteddate;
    }

    public void setAdmitteddate(String admitteddate) {
        this.admitteddate = admitteddate;
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

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getWardwid() {
        return wardwid;
    }

    public void setWardwid(int wardwid) {
        this.wardwid = wardwid;
    }
    
    
    
}
