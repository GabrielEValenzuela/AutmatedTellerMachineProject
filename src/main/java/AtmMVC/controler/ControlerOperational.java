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
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
class ControlerOperational implements ControlerInterface {
    
    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;

    public ControlerOperational(AtmModel model, QueryConnection con, Customer customer, Card card) {
        this.model = model;
        this.con = con;
        this.customer = customer;
        this.card = card;
    }

    @Override
    public void init() {
        JOptionPane.showMessageDialog(null, ":D", "Va queriendo", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
