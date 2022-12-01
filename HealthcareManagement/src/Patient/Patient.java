package Patient;

import Profile.Profile;
import User.User;

/**
 *
 * @author saidutt
 */
public class Patient extends Profile{
    
    private String name;
    private int age;
    private String sex;
    private String email;
    
    
    public Patient(User user) {
        
        super(user);
        user.setProfile(this);
    }

    @Override
    public String getRole() {
        
        return "Patient";
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
