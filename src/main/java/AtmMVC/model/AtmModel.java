/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.model;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author gabriel
 */
public class AtmModel implements Subject {
    
    private QueryConnection dbcon;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    private Observer o;
    private ArrayList<Observer> observers;
    
    public AtmModel() {
        observers = new ArrayList<Observer>();
    }
    
    public void makeTransferPayment(float amount, Customer customerOrigin, Customer customerTarget, QueryConnection con, ATM atm) throws IllegalBalanceException {
        if (customerOrigin.getBalance() <= 0 || amount > customerOrigin.getBalance()) {
            throw new IllegalBalanceException("Saldo insuficiente/Monto mayor al disponible");
        }
        con.updateBalance(-amount, customerOrigin);
        con.updateBalance(amount, customerTarget);
        
    }
    
    public void makeDeposit(float amount, Customer customer, QueryConnection con, ATM atm) {
        con.updateBalance(amount, customer);
        atm.setSelfBalance(amount += atm.getSelfBalance());
    }
    
    public void makeExtraction(float amount, Customer customer, QueryConnection con, ATM atm) throws IllegalBalanceException {
        if (customer.getBalance() <= 0 || amount > customer.getBalance() || amount > atm.getMAXTRANSFER()) {
            throw new IllegalBalanceException("Saldo insuficiente");
        }
        con.updateBalance(-amount, customer);
        atm.setSelfBalance(atm.getSelfBalance()-amount);
    }
    
    public void enableDesable(ATM atm, boolean status) {
        atm.setEnable(status);
    }
    
    public void changePIN(Customer customer, QueryConnection con, int PIN) {
        
    }
    
    public boolean isValid(Card card){
        return card.isCurrentStatus();
    }
    
    @Override
    public void notifyAllObservers(float update) {
        for (Observer ob : observers) {
            o.update(update);
        }
    }
    
    @Override
    public void registerObserver(java.util.Observer o) {
        observers.add((Observer) o);
    }
    
    @Override
    public void removeObserver(java.util.Observer o) {
        observers.remove(o);
    }
}
