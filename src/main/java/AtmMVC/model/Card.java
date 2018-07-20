/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.model;

/**
 *
 * @author gabriel
 */
public class Card {
    
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
    
    
    
}
