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
import AtmMVC.model.IllegalBalanceException;
import AtmMVC.model.QueryConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class mainAtm {

    public static void main(String[] args) {
        AtmModel model = new AtmModel();
        QueryConnection con = new QueryConnection();
        ATM atm = new ATM();
        ControlerInterface controler = new ControlerLogin(model, con);
        controler.init();
}
}
    

 