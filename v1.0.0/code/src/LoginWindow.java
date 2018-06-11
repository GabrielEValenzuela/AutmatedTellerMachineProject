import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class LoginWindow extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginWindow dialog = new LoginWindow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginWindow() {
		setTitle("ATMSoftware");
		setBounds(100, 100, 511, 442);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(314, 209, 154, 49);
		contentPanel.add(btnCancel);
		
		JButton btnClear = new JButton("Borrar");
		btnClear.setBounds(314, 149, 154, 49);
		contentPanel.add(btnClear);
		
		JButton btnConfirm = new JButton("Confirmar");
		btnConfirm.setBounds(314, 89, 154, 49);
		contentPanel.add(btnConfirm);
		
		JButton btnNumberOne = new JButton("1");
		btnNumberOne.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberOne.setBounds(73, 90, 50, 50);
		contentPanel.add(btnNumberOne);
		
		JButton btnNumberTwo = new JButton("2");
		btnNumberTwo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberTwo.setBounds(133, 89, 50, 50);
		contentPanel.add(btnNumberTwo);
		
		JButton btnNumberThree = new JButton("3");
		btnNumberThree.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberThree.setBounds(193, 89, 50, 50);
		contentPanel.add(btnNumberThree);
		
		JButton btnNumberFour = new JButton("4");
		btnNumberFour.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberFour.setBounds(73, 151, 50, 50);
		contentPanel.add(btnNumberFour);
		
		JButton btnNumberFive = new JButton("5");
		btnNumberFive.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberFive.setBounds(133, 150, 50, 50);
		contentPanel.add(btnNumberFive);
		
		JButton btnNumberSix = new JButton("6");
		btnNumberSix.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberSix.setBounds(193, 150, 50, 50);
		contentPanel.add(btnNumberSix);
		
		JButton btnNumberSeven = new JButton("7");
		btnNumberSeven.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberSeven.setBounds(73, 211, 50, 50);
		contentPanel.add(btnNumberSeven);
		
		JButton btnNumberEight = new JButton("8");
		btnNumberEight.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberEight.setBounds(133, 210, 50, 50);
		contentPanel.add(btnNumberEight);
		
		JButton btnNumberNine = new JButton("9");
		btnNumberNine.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberNine.setBounds(193, 210, 50, 50);
		contentPanel.add(btnNumberNine);
		
		JButton btnNumberZero = new JButton("0");
		btnNumberZero.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNumberZero.setBounds(133, 271, 50, 50);
		contentPanel.add(btnNumberZero);
		
		JLabel lblPIN = new JLabel("Por favor, inserte su PIN");
		lblPIN.setHorizontalAlignment(SwingConstants.CENTER);
		lblPIN.setFont(new Font("Arial Narrow", Font.BOLD, 19));
		lblPIN.setBounds(10, 11, 475, 21);
		contentPanel.add(lblPIN);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 43, 173, 20);
		contentPanel.add(passwordField);
	}
}