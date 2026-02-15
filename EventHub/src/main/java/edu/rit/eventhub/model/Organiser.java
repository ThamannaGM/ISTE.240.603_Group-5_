package edu.rit.eventhub.model;

import org.springframework.stereotype.Component;

@Component
public class Organiser {

    private String Name;
    private String email;
    private String password;
    private int userId;
    private String companyName;
    private int phoneNumber;

    public String getUserName() {
        return Name;
    }

    public void setUserName(String userName) {
        this.Name = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCompanyName() { return companyName; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public int getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

}
