package Driver;

import Profile.Profile;
import User.User;

/**
 *
 * @author saidutt
 */
public class Driver extends Profile{
            
    private String name;
    private int age;
    private String sex;
    private String email;      
    
    public Driver(User user) {
        
        super(user);
        user.setProfile(this);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    @Override
    public String getRole() {
        
        return "Driver";
    }
    
}
