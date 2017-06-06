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
public class Invoice {
    
    int inid;
    int admissionaid;
    int hospitalcharges;
    int doctorcharges;
    int doctorvisitcharge;
    int medicinecharge;
    int foodcharge;
    int total;
    
    public Invoice(){
        
    }
    
     public Invoice(int inid , int admissionaid,int hospitalcharges , int doctorcharges, int doctorvisitcharge, int medicinecharge,int foodcharge,int total ){
        this.inid = inid;
        this.admissionaid = admissionaid;
        this.hospitalcharges = hospitalcharges;
        this.doctorcharges = doctorcharges;
        this.doctorvisitcharge = doctorvisitcharge;
        this.medicinecharge = medicinecharge;
        this.foodcharge = foodcharge;
        this.total = total;
    }
    
    public int getInid(){
        return inid;
    }
    
    public void setInid(int inid){
        this.inid = inid;
        
    }
    
    public int getAdmissionaid() {
        return admissionaid;
    }
    
    public void setAdmissionaid(int admissionaid) {
        this.admissionaid = admissionaid;
    }

    public int getHospitalcharges() {
        return hospitalcharges;
    }
    
    public void setHospitalcharges(int hospitalcharges){
        this.hospitalcharges = hospitalcharges;
    }
    
    public int getDoctorcharges(){
        return doctorcharges;
    }
    
    public void setDoctorcharges(int doctorcharges) {
        this.doctorcharges = doctorcharges;
    }
    
    public int getDoctorvisitcharge() {
        return doctorvisitcharge;
    }

    public void setDoctorvisitcharge(int doctorvisitcharge) {
        //String oldDescription = this.description;
        this.doctorvisitcharge = doctorvisitcharge;
       // changeSupport.firePropertyChange("description", oldDescription, description);
    }
    
    public int getMedicinecharge(){
        return medicinecharge;
    }
    
    public void setMedicinecharge(int medicinecharge) {
        this.medicinecharge = medicinecharge;
    }
    
    public int getFoodcharge(){
        return foodcharge;
    }
    
    public void setFoodcharge(int foodcharge) {
        this.foodcharge= foodcharge;
    }
    
    public int getTotal(){
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
    
}
