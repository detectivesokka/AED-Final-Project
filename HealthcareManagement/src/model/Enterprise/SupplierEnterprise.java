/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ganesh Kukreja
 */
public class SupplierEnterprise extends Enterprise {

    private Supplier supplier;

    public SupplierEnterprise(String name) {
        super(name, EnterpriseType.Supplier);
        this.supplier = new Supplier();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * Returns list of all organizations belonging to supplier Enterprise.
     *
     * @return List of organization types
     */
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Pharmacist);
        orgTypes.add(Organization.Type.DeliveryMan);
        
        return orgTypes;

    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void addMedicine(Medicine m){
        this.supplier.getMeds().add(m);
    }
    
    public void setSupplier(Supplier supplierDirectory) {
        this.supplier = supplierDirectory;
    }

}
