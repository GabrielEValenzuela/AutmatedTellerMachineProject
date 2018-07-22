/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AtmMVC.controler.Configurator;
import AtmMVC.controler.ControlerInterface;
import AtmMVC.controler.ControlerLogin;
import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class mainAtm {

    public static void main(String[] args) {
        try {
            Configurator config = Configurator.getConfigurator(new AtmModel(), new QueryConnection(), new Card(), new Customer(), new ATM());
            ControlerInterface controler = new ControlerLogin(config.getModel(), config.getCon(), config.getCustomer(), config.getCard(), config.getAtm());
            controler.init();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
