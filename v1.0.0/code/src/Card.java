
public class Card {
	private boolean status;
	private String cardID;
	private Customer customerAssociated;
	
	
	public Card (String cardID, boolean status) {
		
		this.cardID = cardID;
		this.status = status;
	}
	
	public boolean getCurrentStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setCustomerAssociated(Customer customerAssociated) {
		this.customerAssociated = customerAssociated;
	}
	
	public String getCardID() {
		return cardID;
	}
	
	public Customer getCustomerAssociated() {
		return customerAssociated;
	}
}