package model;

import java.util.ArrayList;
import model.HealthcareNetwork.HealthcareNetwork;
import model.Organization.Organization;

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

    private EcoSystem() {
        
        super(null);
        networks = new ArrayList<HealthcareNetwork>();
    }

}
