package AtmMVC.model;

import java.util.Observer;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Card implements Observer {

    private int cardId;
    private String bankAssociated;
    private int customerAssociated;
    private boolean currentStatus;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getBankAssociated() {
        return bankAssociated;
    }

    public void setBankAssociated(String bankAssociated) {
        this.bankAssociated = bankAssociated;
    }

    public int getCustomerAssociated() {
        return customerAssociated;
    }

    public void setCustomerAssociated(int customerAssociated) {
        this.customerAssociated = customerAssociated;
    }

    public boolean isCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(boolean currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public void update(java.util.Observable o, Object arg) {

    }

}