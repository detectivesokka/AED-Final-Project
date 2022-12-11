/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Sai Dutt
 */
public class InsuranceWorkRequest extends WorkRequest {

    private String policyNum;
    private String ssn;
    private String policyName;
    private String incCompany;
    private double claimAmount;
    private String brokerName;
    private String financeManagerName;
    private double billAmount;
    private InsuranceCustomer insCustomer;
    private String healthCenter;

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyType) {
        this.policyName = policyType;
    }

    public String getIncCompany() {
        return incCompany;
    }

    public void setIncCompany(String incCompany) {
        this.incCompany = incCompany;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    @Override
    public String toString() {
        return policyNum;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getFinanceManagerName() {
        return financeManagerName;
    }

    public void setFinanceManagerName(String financeManagerName) {
        this.financeManagerName = financeManagerName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public InsuranceCustomer getInsCustomer() {
        return insCustomer;
    }

    public void setInsCustomer(InsuranceCustomer insCustomer) {
        this.insCustomer = insCustomer;
    }

    public String getHealthCenter() {
        return healthCenter;
    }

    public void setHealthCenter(String healthCenter) {
        this.healthCenter = healthCenter;
    }

}
