import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;

public class PrincipalWindow extends JFrame{

	private JFrame principalWindow;
	private JButton btnInsertCard;
	private JLabel lblAvd;
	private InsertCardWindow insertCard;
	private OperationWindow oprWindow;
	private LoginWindow loginWindow;

	/**
	 * Create the application.
	 */
	public PrincipalWindow() {
		initialize();
		this.insertCard = new InsertCardWindow();
		this.loginWindow = new LoginWindow();
		this.oprWindow = new OperationWindow();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		principalWindow = new JFrame("ATMSoftware");
		principalWindow.getContentPane().setBackground(Color.WHITE);
		principalWindow.setBounds(100, 100, 511, 442);
		principalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principalWindow.getContentPane().setLayout(null);
		
		btnInsertCard = new JButton("Insertar tarjeta");
		btnInsertCard.setBounds(10, 352, 475, 40);
		principalWindow.getContentPane().add(btnInsertCard);
		principalWindow.setVisible(true);
		
		
	}
	
	public JFrame getFrame() {
		return principalWindow;
	}
	
	void btnInsertCard(ActionListener listenerForCard) {
		btnInsertCard.addActionListener(listenerForCard);
	}
	
	void setVisibleInsert(boolean flagInsert) {
		insertCard.setVisible(flagInsert);
	}
	
	void setVisibleLogin(boolean flagLog) {
		loginWindow.setVisible(flagLog);
	}
	
	void setVisibleOperation(boolean flagOpr) {
		oprWindow.setVisible(flagOpr);
	}
	
	void setVisibleWindow(boolean flagWin) {
		principalWindow.setVisible(flagWin);
	}
	
}