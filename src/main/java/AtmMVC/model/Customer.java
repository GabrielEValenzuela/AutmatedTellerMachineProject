package AtmMVC.model;

import java.util.Observable;

public class Customer extends Observable {

    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private float balance;
    private String PIN;
    private String bank;
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

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public boolean hasDoubleCheck() {
        return doubleCheck;
    }

    public void setDoubleCheck(boolean doubleCheck) {
        this.doubleCheck = doubleCheck;
    }

    public String getBank() {
        return bank.toUpperCase();
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void change() {
        notifyObservers();
    }

}