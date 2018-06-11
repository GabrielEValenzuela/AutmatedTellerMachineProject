import java.util.HashMap;

public class main {

	
	public static void main(String[] args) {
		
		ATMModel theModel = new ATMModel("A01456", 15000);
		ATMView theView = new ATMView();
		ATMController theController = new ATMController(theView, theModel);
	}
	
}
