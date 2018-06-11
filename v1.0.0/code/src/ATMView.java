
public class ATMView {
	
	private InsertCardWindow insertCard;
	private PrincipalWindow mainWindow;
	private LoginWindow loginWindow;
	private OperationWindow oprWindow;
	
	public ATMView() {
		this.mainWindow = new PrincipalWindow();
	}
	
	public InsertCardWindow getWindowInsert() {
		return this.insertCard;
		
	}
	
	public PrincipalWindow getPrincipalWindow() {
		return this.mainWindow;
	}
	
	public LoginWindow getLoginWindow() {
		return this.loginWindow;
	}
	
	public OperationWindow getOperationWindow() {
		return this.oprWindow;
	}
	
	

}
