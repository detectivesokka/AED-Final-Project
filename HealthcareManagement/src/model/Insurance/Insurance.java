/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Insurance;

/**
 *
 * @author Sai Dutt
 */
public class Insurance {

    private String policy;
    private String incCompany;
    private double coverage;
    private String policyTC;
    private double premiumMonthly;

    public Insurance(String policyName, String InsuranceCompany, double coverage) {
        
        this.policy = policyName;
        this.incCompany = InsuranceCompany;
        this.coverage = coverage;
    }

    public String getPolicyName() {
        return policy;
    }

    public void setPolicyName(String policyType) {
        this.policy = policyType;
    }

    public double getMonthlyPremium() {
        return premiumMonthly;
    }

    public void setMonthlyPremium(double monthlyPremium) {
        this.premiumMonthly = monthlyPremium;
    }

    public String getIncCompany() {
        return incCompany;
    }

    public void setIncCompany(String incCompany) {
        this.incCompany = incCompany;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public String getPolicyTC() {
        return policyTC;
    }

    public void setPolicyTC(String policyTC) {
        this.policyTC = policyTC;
    }

    @Override
    public String toString() {
        return policy;
    }

}
