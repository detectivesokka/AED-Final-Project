/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Network.HealthcareNetwork;
import model.Organization.Organization;
import model.Role.Role;
import model.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Sai Dutt
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecosystem;
    private ArrayList<HealthcareNetwork> networks;

    public static EcoSystem getInstance() {
        
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    public HealthcareNetwork createAndAddNetwork() {
        
        HealthcareNetwork network = new HealthcareNetwork();
        networks.add(network);
        return network;
    }
    
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        
        super(null);
        networks = new ArrayList<HealthcareNetwork>();
    }

    public ArrayList<HealthcareNetwork> getNetworks() {
        
        return networks;
    }

    public void setNetworks(ArrayList<HealthcareNetwork> networks) {
        
        this.networks = networks;
    }
    
    public HealthcareNetwork searchNetwork(String name) {
        
        for(HealthcareNetwork n : this.networks) {
            
            if(n.getNetworkName().equals(name)) {
                
                return n;
            }
        }
        
        return null;
    }   
}
