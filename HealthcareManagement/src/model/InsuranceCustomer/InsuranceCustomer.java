/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.InsuranceCustomer;

/**
 *
 * @author Sai Dutt
 */
import model.Insurance.Insurance;

public class InsuranceCustomer {

    private String custLastName;
    private String custFirstName;
    private String custSSN;
    private String custDOB;
    private int custAge;
    private String custEmail;
    private String phoneNumber;
    private String custAddress;
    private String custGender;
    private String policyStartDate;
    private String policyEndDate;

    private Insurance insurance;
    private String insurancePolicyNumber;

    public InsuranceCustomer(Insurance insurance, String policyNumber) {
        this.insurance = insurance;
        this.insurancePolicyNumber = policyNumber;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    public String getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(String custDOB) {
        this.custDOB = custDOB;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public String getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(String policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public String getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(String policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public String toString() {
        return insurancePolicyNumber;
    }

}
