package PharmaEnterprise;

import User.User;

/**
 *
 * @author Ganesh Kukreja
 */
public class Pharmacist{
    
    private User user;        
    
    private String name;
    private int age;
    private String sex;
    private long phoneno;
    private String email;

    public Pharmacist(User user) {
        
        this.user = user;
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
