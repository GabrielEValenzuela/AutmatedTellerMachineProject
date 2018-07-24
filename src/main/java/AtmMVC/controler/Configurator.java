package AtmMVC.controler;

import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
import AtmMVC.controler.ControlerLogin;

public class Configurator {

    private QueryConnection con;
    private ATM atm;
    private static Configurator myConfigSingleton;

    private Configurator(QueryConnection con, ATM atm) {
        this.con = con;
        this.atm = atm;
    }

    public static Configurator getConfigurator(QueryConnection con, ATM atm) {
        if (myConfigSingleton == null) {
            synchronized (Configurator.class) {
                atm.setId(402315);
                atm.setEnable(true);
                atm.setSelfBalance(40000);
                myConfigSingleton = new Configurator(con, atm);
            }
        }
        return myConfigSingleton;
    }

    public QueryConnection getCon() {
        return con;
    }

    public ATM getAtm() {
        return atm;
    }

}
