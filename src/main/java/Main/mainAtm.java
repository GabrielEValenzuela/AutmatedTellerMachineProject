/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

<<<<<<< HEAD
=======
import AtmMVC.controler.Configurator;
>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15
import AtmMVC.controler.ControlerInterface;
import AtmMVC.controler.ControlerLogin;
import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
<<<<<<< HEAD
=======
import javax.swing.JOptionPane;
>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15

/**
 *
 * @author gabriel
 */
public class mainAtm {

    public static void main(String[] args) {
<<<<<<< HEAD
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
=======
        try {
            Configurator config = Configurator.getConfigurator(new AtmModel(), new QueryConnection(), new Card(), new Customer(), new ATM());
            ControlerInterface controler = new ControlerLogin(config.getModel(), config.getCon(), config.getCustomer(), config.getCard(), config.getAtm());
            controler.init();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

>>>>>>> c5eeee8c290de06f237b2b18abfb7cf025e0ab15
    }
}
