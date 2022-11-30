/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PharmaEnterprise;

import Profile.Profile;
import User.User;

/**
 *
 * @author ganes
 */
public class Pharmacy extends Profile{
    
    private String name;
    private int age;
    private String sex;
    private long phoneno;
    private String email;

    public Pharmacy(User user) {
        
        super(user);
        user.setProfile(this); 
    }

    @Override
    public String getRole() {
        
        return "Pharmacist";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
