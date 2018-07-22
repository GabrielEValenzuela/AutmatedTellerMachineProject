/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.controler;

import AtmMVC.model.ATM;
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
<<<<<<< HEAD
public class ControlerPin implements ActionListener,ControlerInterface{
    
=======
public class ControlerPin implements ActionListener, ControlerInterface {

>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15
    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;
    private ATM atm;
    private PinWindow pin;
<<<<<<< HEAD
    
    public ControlerPin(AtmModel model, QueryConnection con, Customer customer, Card card, ATM atm){
=======
    private int attempts = 0;

    public ControlerPin(AtmModel model, QueryConnection con, Customer customer, Card card, ATM atm) {
>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15
        this.model = model;
        this.con = con;
        this.customer = customer;
        this.card = card;
        this.atm = atm;
        this.pin = new PinWindow();
    }
<<<<<<< HEAD
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pin.jbtnConfirm){
            String str = String.valueOf(pin.jpwrd.getPassword());
            con.getCustomer(card.getCustomerAssociated(), customer);
            if (str.equals(customer.getPIN())){
            ControlerInterface op = new ControlerOperational(model, con, customer, card, atm);
            JOptionPane.showMessageDialog(null, "¡ Bienvenido "+customer.getFirstName()+ " !");
            close();
            op.init();
       }
    }
        
        if(e.getSource() == pin.jbtnCancell){
=======

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pin.jbtnConfirm) {
            String str = String.valueOf(pin.jpwrd.getPassword());
            if (!str.equals(customer.getPIN())) {
                Attempts();
                JOptionPane.showMessageDialog(null, "Pin incorrecto restan " + (4 - attempts) + " intentos.", "Problema", JOptionPane.ERROR_MESSAGE);
                pin.jpwrd.setText(null);
            }
            if (attempts == 4) {
                update();
            }
            if (str.equals(customer.getPIN())) {
                ControlerInterface op = new ControlerOperational(model, con, customer, card, atm);
                JOptionPane.showMessageDialog(null, "¡ Bienvenido " + customer.getFirstName() + " !");
                close();
                op.init();
            }
        }

        if (e.getSource() == pin.jbtnCancell) {
>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15
            ControlerInterface login = new ControlerLogin(model, con, customer, card, atm);
            close();
            login.init();
        }
<<<<<<< HEAD
    
}

    @Override
    public void init() {
     pin.setVisible(true);
=======

    }

    @Override
    public void init() {
        pin.setVisible(true);
>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15
        pin.jbtnConfirm.addActionListener(this);
        pin.jbtnCancell.addActionListener(this);
    }

    @Override
    public void close() {
        pin.setVisible(false);
<<<<<<< HEAD
        
    }
}
=======

    }

    private int Attempts() {
        return this.attempts += 1;
    }

    private void update() {
        con.blockCard(card);
        JOptionPane.showMessageDialog(null, "La tajeta " + card.getCardId() + " ha sido bloqueada", "Bloqueo", JOptionPane.ERROR_MESSAGE);
        ControlerInterface login = new ControlerLogin(model, con, customer, card, atm);
        close();
        login.init();

    }
}
>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15
