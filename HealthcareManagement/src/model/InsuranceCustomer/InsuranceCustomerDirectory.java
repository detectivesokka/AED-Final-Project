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
import java.util.ArrayList;
import java.util.List;

public class InsuranceCustomerDirectory {

    private ArrayList<InsuranceCustomer> insCustomers = new ArrayList<>();

    public ArrayList<InsuranceCustomer> getInsuranceCustomers() {
        return insCustomers;
    }

    public void setInsuranceCustomers(ArrayList<InsuranceCustomer> insuranceCustomers) {
        this.insCustomers = insuranceCustomers;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insCustomers + '}';
    }

}
