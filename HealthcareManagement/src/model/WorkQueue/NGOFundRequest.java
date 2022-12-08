/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

/**
 *
 * @author Ganesh Kukreja
 */
public class NGOFundRequest extends WorkRequest {

    private String location;
    private int population;
    private double amount;

    public NGOFundRequest(String location, int population, double requestAmount) {
            
        this.location = location;
        this.population = population;
        this.amount = requestAmount;
    }

    @Override
    public String toString() {
        return location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
