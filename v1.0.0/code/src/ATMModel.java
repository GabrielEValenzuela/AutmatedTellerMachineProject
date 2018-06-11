
public class ATMModel {
	
	private String atmId;
	private boolean atmStatus;
	private double atmBalance;
	
	public ATMModel(String atmId,double atmBalance) {
		this.atmId = atmId;
		this.atmBalance = atmBalance;		
	}
	
	public void setStatus(boolean status) {
		this.atmStatus = status;
	}
	
	public String getAtmId() {
		return atmId;
	}
	
	public boolean getCurrentStatus() {
		return atmStatus;
	}
	
	public double getBalance() {
		return atmBalance;
	}
	
	public Customer getCustomer(String ID) {
		
		return null;
		
	}
	
	public void UpdateBalance(double balance) throws IllegalBalanceException {
		if(getBalance() < 0 && balance < 0) {
			throw new IllegalBalanceException();
		}
		this.atmBalance += balance;
	}
	
	public void MakeDeposit(Customer customer, double deposit) {
		if(deposit > 0) {
		this.atmBalance += deposit;
		try {
			customer.setBalance(deposit);
		} catch (IllegalBalanceException e) {
}
	}
		}
	
	public void MakeExtraction(Customer customer, double extraction) throws IllegalBalanceException{
		if(customer.getBalance() < extraction || getBalance() < extraction || getCurrentStatus()==false) {
			throw new IllegalBalanceException();
		}
		UpdateBalance(-extraction);
		customer.setBalance(-extraction);
		}
	
	public void MakeTransfer(Customer originCustomer, Customer targetCustomer, double transfer) {
		if(ValidateCustomer(originCustomer.getAccountID()) && ValidateCustomer(targetCustomer.getAccountID())) {
			try {
				ValidateTransfer(originCustomer.getBalance(),transfer);
				originCustomer.setBalance(-transfer);
				targetCustomer.setBalance(transfer);
			} catch (IllegalBalanceException e) {	
				
			}	
			
		}
}
	
	public void MakePayment(Customer customer, double amount) {
		try {
			ValidateTransfer(customer.getBalance(), amount);
			customer.setBalance(-amount);
		} catch (IllegalBalanceException e) {
		}
		
	}
	
	public boolean ValidateCustomer(String ID) {
		if(ID.equals(null)) {
			return false;	
		}
		return true;
	
}
	
	public void ValidateTransfer(double origin, double amount) throws IllegalBalanceException {
		if(origin < amount) {
		throw new IllegalBalanceException();
		}
	}
	
	

}