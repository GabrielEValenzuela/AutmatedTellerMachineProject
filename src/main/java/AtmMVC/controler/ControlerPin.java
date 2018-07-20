/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.controler;

import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
import AtmMVC.view.PinWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class ControlerPin implements ActionListener,ControlerInterface{
    
    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;
    private PinWindow pin;
    
    public ControlerPin(AtmModel model, QueryConnection con, Customer customer, Card card){
        this.model = model;
        this.con = con;
        this.customer = customer;
        this.card = card;
        this.pin = new PinWindow();
    }

    public Card getCard() {
        return card;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pin.jbtnConfirm){
            String str = String.valueOf(pin.jpwrd.getPassword());
            con.getCustomer(getCard().getCustomerAssociated(), getCustomer());
            if (str.equals(customer.getPIN())){
            ControlerInterface op = new ControlerOperational(model, con, customer, card);
            JOptionPane.showMessageDialog(null, "¡ Bienvenido "+getCustomer().getFirstName()+ " !");
            close();
            op.init();
       }
    }
        
        if(e.getSource() == pin.jbtnCancell){
            ControlerInterface login = new ControlerLogin(model, con);
            close();
            login.init();
        }
    
}

    @Override
    public void init() {
     pin.setVisible(true);
        pin.jbtnConfirm.addActionListener(this);
        pin.jbtnCancell.addActionListener(this);
    }

    @Override
    public void close() {
     pin.dispose();
    }
}