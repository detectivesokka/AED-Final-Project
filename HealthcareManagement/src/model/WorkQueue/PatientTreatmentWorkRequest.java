/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.Patient.Patient;
import model.UserAccount.UserAccount;

/**
 *
 * @author akshi
 */
public class PatientTreatmentWorkRequest extends WorkRequest {

    private String regDate;
    private String reason;
    private Patient patient;
    private String labTestType;
    private String labResult;
    private UserAccount labAssistant;
    private String labTestMessage;
    private double medCharges;
    private String prescription;
    private double billAmt;
    private UserAccount assignedDoctor;

    public PatientTreatmentWorkRequest(String Date, String reasonForVisit, Patient patient) {
        
        this.regDate = Date;
        this.reason = reasonForVisit;
        this.patient = patient;
    }

    public String getRegDate() {
        
        return regDate;
    }

    public void setRegDate(String Date) {
        
        this.regDate = Date;
    }

    public double getMedCharges() {
        
        return medCharges;
    }

    public void setMedCharges(double medCharges) {
        
        this.medCharges = medCharges;
    }

    public String getReason() {
        
        return reason;
    }

    public void setReason(String reason) {
        
        this.reason = reason;
    }

    public Patient getPatient() {
        
        return patient;
    }

    public void setPatient(Patient patient) {
        
        this.patient = patient;
    }

    public String getLabTestType() {
        
        return labTestType;
    }

    public void setLabTestType(String labTestType) {
        
        this.labTestType = labTestType;
    }

    public String getLabResult() {
        
        return labResult;
    }

    public void setLabResult(String labResult) {
        
        this.labResult = labResult;
    }

    public UserAccount getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(UserAccount labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabTestMessage() {
        return labTestMessage;
    }

    public void setLabTestMessage(String labTestMessage) {
        this.labTestMessage = labTestMessage;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }

    public UserAccount getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(UserAccount assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    @Override
    public String toString() {
        return reason;
    }

}
