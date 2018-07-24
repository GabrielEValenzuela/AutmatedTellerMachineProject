package AtmMVC.model;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observer;

public class AtmModel {

    private QueryConnection dbcon;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    private HashMap<String, Commisions> com;
    private ArrayList<Observer> observers;

    public AtmModel() {
        this.com = new HashMap<>();
        com.put("NACION", new NacionBank());
        com.put("BANCOR", new BancorBank());
        com.put("GALICIA", new GaliciaBank());
        this.observers = new ArrayList<>();

    }

    public void makeTransferPayment(float amount, Customer customerOrigin, Customer customerTarget, QueryConnection con, ATM atm) throws IllegalBalanceException {
        if (customerOrigin.getBalance() <= 0 || amount > customerOrigin.getBalance()) {
            throw new IllegalBalanceException("Saldo insuficiente/Monto mayor al disponible");
        }
        Commisions comision = com.get(customerOrigin.getBank());
        con.updateBalance(-(amount + amount * comision.getCommision()), customerOrigin);
        con.updateBalance(amount, customerTarget);
        customerOrigin.change();
        customerTarget.change();

    }

    public void makeDeposit(float amount, Customer customer, QueryConnection con, ATM atm) {
        con.updateBalance(amount, customer);
        atm.setSelfBalance(amount += atm.getSelfBalance());
        customer.change();
    }

    public void makeExtraction(float amount, Customer customer, QueryConnection con, ATM atm) throws IllegalBalanceException {
        if (customer.getBalance() <= 0 || amount > customer.getBalance() || amount > atm.getMAXTRANSFER()) {
            throw new IllegalBalanceException("Saldo insuficiente");
        }
        con.updateBalance(-amount, customer);
        atm.setSelfBalance(atm.getSelfBalance() - amount);
        customer.change();
    }

    public void enableDesable(ATM atm, boolean status) {
        atm.setEnable(status);
    }

    public boolean isValid(Card card) {
        return card.isCurrentStatus();
    }

    public HashMap<String, Commisions> getMap() {
        return com;
    }
}