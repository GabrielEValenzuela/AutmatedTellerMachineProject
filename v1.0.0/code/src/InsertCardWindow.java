import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class InsertCardWindow extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldIDCard;
	private JButton btnConfirm;
	
	public InsertCardWindow() {
		
		getContentPane().setLayout(null);
		
		JLabel lblInsert = new JLabel("Insertar n\u00FAmero de tarjeta");
		lblInsert.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsert.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblInsert.setBounds(42, 30, 414, 23);
		getContentPane().add(lblInsert);
		
		txtFieldIDCard = new JTextField();
		txtFieldIDCard.setBounds(42, 119, 414, 23);
		getContentPane().add(txtFieldIDCard);
		txtFieldIDCard.setColumns(10);
		
		btnConfirm = new JButton("Confirmar");
		btnConfirm.setBounds(10, 189, 466, 40);
		getContentPane().add(btnConfirm);
		setTitle("ATMSoftware");
		setBounds(100, 100, 502, 279);
		}
	
	public String getID() {
		return txtFieldIDCard.toString();
	}
	
	void btnConfirmListener(ActionListener listenerForConfirm) {
		btnConfirm.addActionListener(listenerForConfirm);
		contentPanel.setVisible(false);
	}
	
	void displayError() {
		JOptionPane.showMessageDialog(null ,"Tarjeta no valida", "Error" , JOptionPane.ERROR_MESSAGE);
	}
	
	void displayOK() {
		JOptionPane.showMessageDialog(this,"Tarjeta no valida");
	}

	public void isVisible(boolean flag) {
		setVisible(flag);
		
	}
	
	
	
}