/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

/**
 *
 * @author Ganesh Kukreja
 */
public class Medicine {
    
    private String name;
    private double price;

    public String getMedicineName() {
        return name;
    }

    public void setMedicineName(String medicineName) {
        this.name = medicineName;
    }

    public double getMedicinePrice() {
        return price;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.price = medicinePrice;
    }

    @Override
    public String toString() {
        return name;
    }
}
