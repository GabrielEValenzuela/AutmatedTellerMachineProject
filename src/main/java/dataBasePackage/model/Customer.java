/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage.model;

/**
 *
 * @author gabriel
 */
public class Customer {
    
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private float balance;
    private int PIN;
    private boolean doubleCheck;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public boolean hasDoubleCheck() {
        return doubleCheck;
    }

    public void setDoubleCheck(boolean doubleCheck) {
        this.doubleCheck = doubleCheck;
    }
    
    
    
}
