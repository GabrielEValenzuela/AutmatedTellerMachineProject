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
 * @author Grupo ARES
 */
public class mainAtm {

    public static void main(String[] args) {
        try {
            Configurator config = Configurator.getConfigurator(new QueryConnection(), new ATM());
            ControlerInterface controler = new ControlerLogin(new AtmModel(), config.getCon(), new Customer(), new Card(), config.getAtm());
            controler.init();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
