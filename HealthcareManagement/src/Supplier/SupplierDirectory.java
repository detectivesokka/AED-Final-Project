package Supplier;

import User.User;
import java.util.ArrayList;

/**
 *
 * @author ganesh kukreja
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierList;
        
        
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supList) {
        this.supplierList = supList;
    }   
    
    public Supplier addSupplier(User user){
        
        if(user == null)
        {
            return null;
        }
         Supplier s = new Supplier(user);
         supplierList.add(s);
         return s;
         
    }
    
    public Supplier searchSupplier(String name){
        
        for(Supplier s: supplierList){
            
            if(s.getName().equals(name))
                return s;
        }
        
        return null;
    }
    
    public int deleteSupplier(String name){
        
        Supplier s = searchSupplier(name);
        
        if(s == null)
            return 1;
        
        supplierList.remove(s);
        
        return 0;
        
    }
}
