package Role;

/**
 *
 * @author saidutt
 */
public class Role {
    
    // Roles of SystemAdmin, MEAdmin, GEAdmin, PEAdmin, SEAdmin, Doctor, Nurse, Patient, Driver, 
    // InsuranceAgent, Policeman, Pharmacist, Seller
    private int role;
    private String roleName;       

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        
        this.role = role;
        
        switch(role) {
            
            case 0 -> { this.roleName = "System admin";}
            case 1 -> {this.roleName = "Medical enterprise admin";}
            case 2 -> {this.roleName = "Government enterprise admin";}
            case 3 -> {this.roleName = "Pharma enterprise admin";}
            case 4 -> {this.roleName = "Supplier enterprise admin";}
            case 5 -> {this.roleName = "Doctor";}
            case 6 -> {this.roleName = "Patient";}
            case 7 -> {this.roleName = "Nurse";}
            case 8 -> {this.roleName = "Driver";}
            case 9 -> {this.roleName = "Insurance agent";}
            case 10 -> {this.roleName = "Policeman";}
            case 11 -> {this.roleName = "Pharmacist";}
            case 12 -> {this.roleName = "Seller";}
            default -> {this.roleName = "";}
        }
    }
    
    public String getRoleAsString() {
                
        return roleName;
    }        
}
