import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.org.apache.xerces.internal.impl.validation.ValidationState;

public class ATMController {

	private ATMView theView;
	private ATMModel theModel;
	
	public ATMController(ATMView theView, ATMModel theModel) {
		this.theModel = theModel;
		this.theView = theView;
	}
	
	void btnInsertCard() {
		this.theView.getPrincipalWindow().btnInsertCard(new listenerConfirm());
	}
	
	class  listenerConfirm implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.print("Pass");
		}
		
	}
	
//	void InsertBtnConfirm() {
//		this.theView.getWindowInsert().btnConfirmListener(new listenerForConfirm());
//		String a = theView.getWindowInsert().getID();
//	}
//	
//	void ParsingID() {
//
//	}
//	
//	class listenerForConfirm implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			try {
//				for(ValidCards c: ValidCards.values()) {
//					if(c.equals(theView.getWindowInsert().getID())) {
//						theView.getWindowInsert().displayOK();
//			}
//					throw new IllegalArgumentException();
//				}
//			}
//			catch (Exception e2) {
//				theView.getWindowInsert().displayError();
//			}
//		}
//	}
//	
//	void btnInsertCard() {
//		this.theView.getPrincipalWindow().btnInsertCard(new listenerForCard());
//	}
//	
//	class listenerForCard implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			
//}
//		}
	}


