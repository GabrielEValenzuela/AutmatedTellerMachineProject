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
import AtmMVC.view.LoginWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class ControlerLogin implements ActionListener, ControlerInterface {

    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;
    private LoginWindow login;

    public Card getCard() {
        return card;
    }

    public final void setCard(Card card) {
        this.card = card;
    }

    public Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ControlerLogin(AtmModel model, QueryConnection con) {
        this.model = model;
        this.con = con;
        this.login = new LoginWindow();
        setCard(new Card());
        setCustomer(new Customer());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.jbtnInsert) {
            con.getCard(Integer.parseInt(login.ViewCardId.getText()), getCard());
            if (card.isCurrentStatus() == true) {
                close();
                ControlerInterface pin = new ControlerPin(model, con, getCustomer(), getCard());
                pin.init();

            } else {
                JOptionPane.showMessageDialog(null, "Tarjeta no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void init() {
        login.setVisible(true);
        login.jbtnInsert.addActionListener(this);
    }

    @Override
    public void close() {
        login.dispose();
    }

}
