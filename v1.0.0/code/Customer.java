
public class Customer {

	private String cardAssociated;
	private String name;
	private String surname;
	private String accountID;
	private double balance;
	private String PIN;
	private String PIN2;
	
	public Customer(String name, String surname, String accountID) {
	this.name = name;
	this.surname = surname;
	this.accountID = accountID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getAccountID() {
		return accountID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	public void setPIN(String PIN) {
		this.PIN = PIN;
	}
	
	public void setPIN2(String PIN2) {
		this.PIN2 = PIN2;
	}
	
	public void setCardAssociated(String card) {
		this.cardAssociated = card;
	}
	
	public String getPIN() {
		return PIN;
	}
	
	public String getPIN2() {
		return PIN2;
	}
}
