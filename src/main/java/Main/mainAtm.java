/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AtmMVC.controler.ControlerInterface;
import AtmMVC.controler.ControlerLogin;
import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;

/**
 *
 * @author gabriel
 */
public class mainAtm {

    public static void main(String[] args) {
        AtmModel model = new AtmModel();
        QueryConnection con = new QueryConnection();
        ATM atm = new ATM();
        Customer customer = new Customer();
        Card card = new Card();
        atm.setEnable(true);
        atm.setSelfBalance(100000);
        atm.setMAXTRANSFER(20000);
        ControlerInterface controler = new ControlerLogin(model, con, customer, card, atm);
        controler.init();
    }
}
