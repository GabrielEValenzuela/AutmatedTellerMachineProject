package AtmMVC.controler;

import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
import AtmMVC.view.LoginWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlerLogin implements ActionListener, ControlerInterface {

    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;
    private ATM atm;
    private LoginWindow login;

    public ControlerLogin(AtmModel model, QueryConnection con, Customer customer, Card card, ATM atm) {
        this.model = model;
        this.con = con;
        this.customer = customer;
        this.card = card;
        this.atm = atm;
        this.login = new LoginWindow();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(login.jbtnInsert)) {
            con.getCard(Integer.parseInt(login.ViewCardId.getText()), card);
            con.getCustomer(card.getCustomerAssociated(), customer);
            if (card.isCurrentStatus() == true && !customer.hasDoubleCheck()) {
                login.close();
                ControlerInterface pin = new ControlerPin(model, con, customer, card, atm);
                pin.init();

            } else {
                JOptionPane.showMessageDialog(null, "Tarjeta no válida", "Error", JOptionPane.ERROR_MESSAGE);
                login.clearInsert();
            }
        }
    }

    @Override
    public void init() {
        if (atm.isEnable()) {
            login.setVisible(true);
            login.jbtnInsert.addActionListener(this);
        }
    }

    @Override
    public void close() {
        login.setVisible(false);
    }
}