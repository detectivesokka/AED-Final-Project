/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Delivery;

import java.util.ArrayList;

/**
 *
 * @author Ganesh Kukreja
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliveryManDirectory;

    public DeliveryManDirectory() {
        
        this.deliveryManDirectory= new ArrayList<>();
        
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    
    
}
