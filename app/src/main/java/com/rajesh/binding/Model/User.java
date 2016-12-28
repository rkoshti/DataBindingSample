package com.rajesh.binding.Model;

/**
 * Created by Rathod on 19-Mar-16.
 */
public class User  {

    public String displayName;
    public int age;
    public String profileImage;

    public User(String displayName, int age, String profileImage){
        this.displayName = displayName;
        this.age = age;
        this.profileImage = profileImage;
    }

    public User(){

    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
