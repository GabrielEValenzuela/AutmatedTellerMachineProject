/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.model;

import com.sun.javafx.sg.prism.NGCanvas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class AtmModel {
    
    private QueryConnection dbcon;
    private PreparedStatement statement = null;
    private ResultSet result = null;


    public void makeTransferPayment(float amount, Customer customerOrigin, Customer customerTarget, QueryConnection con, ATM atm) throws IllegalBalanceException {
        if (customerOrigin.getBalance() <= 0 || amount > customerOrigin.getBalance()) {
            throw new IllegalBalanceException("Saldo insuficiente/Monto mayor al disponible");
        }
        con.updateBalance(-amount, customerOrigin);
        con.updateBalance(amount, customerTarget);

    }

    public void makeDeposit(float amount, Customer customer, QueryConnection con,ATM atm) {
        con.updateBalance(amount, customer);
        atm.setSelfBalance(amount+=atm.getSelfBalance());
    }

    public void makeExtraction(float amount, Customer customer, QueryConnection con, ATM atm) throws IllegalBalanceException {
        if (customer.getBalance() <= 0 || amount > 10000 || amount > atm.getMAXTRANSFER()) {
            throw new IllegalBalanceException("Saldo insuficiente");
        }
        con.updateBalance(-amount, customer);
        atm.setSelfBalance(amount-=atm.getSelfBalance());
    }

}
