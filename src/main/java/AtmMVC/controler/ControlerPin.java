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
public class ControlerPin implements ActionListener, ControlerInterface {

    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;
    private ATM atm;
    private PinWindow pin;
    private int attempts = 0;

    public ControlerPin(AtmModel model, QueryConnection con, Customer customer, Card card, ATM atm) {
        this.model = model;
        this.con = con;
        this.customer = customer;
        this.card = card;
        this.atm = atm;
        this.pin = new PinWindow();
    }

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
                pin.dispose();
                op.init();
            }
        }

        if (e.getSource() == pin.jbtnCancell) {
            ControlerInterface login = new ControlerLogin(model, con, customer, card, atm);
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
        pin.setVisible(false);

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
