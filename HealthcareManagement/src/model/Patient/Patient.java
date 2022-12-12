/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Patient;

import model.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Akshita
 */
public class Patient {

    private String id;
    private String lastName;
    private String firstName;
    private String ssn;
    private String age;
    private String phoneNum;
    private String address;
    private String gender;
    private boolean isTreatmentFinished;
    private String appointmentDate;
    private String email;
    private InsuranceCustomer insuranceCustomer;

    public String getPatientLastName() {
        return lastName;
    }

    public String getPatientEmail() {
        return email;
    }

    public void setPatientEmail(String patientEmail) {
        this.email = patientEmail;
    }

    public void setPatientSSN(String patientSSN) {
        this.ssn = patientSSN;
    }

    public String getPatientAge() {
        return age;
    }

    public void setPatientAge(String patientAge) {
        this.age = patientAge;
    }

    public String getContactNumber() {
        return phoneNum;
    }

    public void setContactNumber(String contactNumber) {
        this.phoneNum = contactNumber;
    }

    public String getPatientAddress() {
        return address;
    }

    public void setPatientAddress(String patientAddress) {
        this.address = patientAddress;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getPatientId() {
        return id;
    }

    public String getPatientGender() {
        return gender;
    }

    public void setPatientGender(String patientGender) {
        this.gender = patientGender;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.firstName = patientFirstName;
    }

    public String getPatientSSN() {
        return ssn;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public void setPatientId(String patientId) {
        this.id = patientId;
    }

    public boolean isIsTreatmentFinished() {
        return isTreatmentFinished;
    }

    public void setIsTreatmentFinished(boolean isTreatmentFinished) {
        this.isTreatmentFinished = isTreatmentFinished;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setPatientLastName(String patientLastName) {
        this.lastName = patientLastName;
    }

    public String getPatientFirstName() {
        return firstName;
    }

}
