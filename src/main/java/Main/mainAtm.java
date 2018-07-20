/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.IllegalBalanceException;
import AtmMVC.model.QueryConnection;

/**
 *
 * @author gabriel
 */
public class mainAtm {

    public static void main(String[] args) {
        AtmModel model = new AtmModel();
        QueryConnection con = new QueryConnection();
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        Card card = new Card();
        Card card1 = new Card();
        ATM atm = new ATM();
        con.getCard(524711, card);
        con.getCustomer(card.getCustomerAssociated(), customer);
        con.getCard(524722, card1);
        con.getCustomer(card1.getCustomerAssociated(), customer2);
        System.out.println(customer.getBalance());
        con.updateBalance(8000, customer);
        System.out.println(customer.getBalance());
        atm.setEnable(true);
        atm.setSelfBalance(1000);
        atm.setMAXTRANSFER(-1);
        model.makeDeposit(2000, customer, con, atm);
        System.out.println(atm.getSelfBalance());
        try {
            model.makeExtraction(4000, customer, con, atm);
        } catch (IllegalBalanceException ex) {
            System.out.println(ex.infoError());
        }
        System.out.println(atm.getSelfBalance());
        
    }
}