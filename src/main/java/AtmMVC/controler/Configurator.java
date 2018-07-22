package AtmMVC.controler;

import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
import AtmMVC.controler.ControlerLogin;

public class Configurator {

    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;
    private ATM atm;
    private static Configurator myConfigSingleton;

    private Configurator(AtmModel model, QueryConnection con, Card card, Customer customer, ATM atm) {
        this.model = model;
        this.con = con;
        this.card = card;
        this.customer = customer;
        this.atm = atm;
    }

    public static Configurator getConfigurator(AtmModel model, QueryConnection con, Card card, Customer customer, ATM atm) {
        if (myConfigSingleton == null) {
            synchronized (Configurator.class) {
                atm.setId(402315);
                atm.setEnable(true);
                atm.setSelfBalance(40000);
                myConfigSingleton = new Configurator(model, con, card, customer, atm);
            }
        }
        return myConfigSingleton;
    }

    public QueryConnection getCon() {
        return con;
    }

    public Card getCard() {
        return card;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ATM getAtm() {
        return atm;
    }

    public AtmModel getModel() {
        return model;
    }

}
