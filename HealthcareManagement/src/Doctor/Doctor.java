package Doctor;

import Profile.Profile;
import User.User;

/**
 *
 * @author saidutt
 */
public class Doctor extends Profile{       
    
    private String name;
    private int age;
    private String sex;
    private String credentials;
    private float experience;        
    
    public Doctor(User user) {
        
        super(user);
        user.setProfile(this); 
    }

    @Override
    public String getRole() {
        
        return "Doctor";
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

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }        
        
}
