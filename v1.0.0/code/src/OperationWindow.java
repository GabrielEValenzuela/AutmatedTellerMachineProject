import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperationWindow extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public OperationWindow() {
		setBounds(100, 100, 575, 394);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		JPanel panelWelcome = new JPanel();
		panelWelcome.setBorder(new TitledBorder(null, "Bievenida", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tu balance", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panelWelcome, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panelWelcome, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		JPanel panelDeposit = new JPanel();
		tabbedPane.addTab("Deposito", null, panelDeposit, null);
		panelDeposit.setLayout(null);
		
		JLabel lblDesdeAquPodrs = new JLabel("Desde aqu\u00ED podr\u00E1s gestionar tus dep\u00F3sitos. Preciona Confirmar para acreditar el dinero");
		lblDesdeAquPodrs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesdeAquPodrs.setBounds(0, 7, 522, 29);
		panelDeposit.add(lblDesdeAquPodrs);
		
		JLabel lblRecuerdaQue = new JLabel("Recuerda que... \u00A1 El cajero no te dar\u00E1 vuelto !");
		lblRecuerdaQue.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecuerdaQue.setBounds(0, 33, 532, 29);
		panelDeposit.add(lblRecuerdaQue);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnConfirmar.setBounds(302, 63, 220, 122);
		panelDeposit.add(btnConfirmar);
		
		textField = new JTextField();
		textField.setBounds(124, 114, 86, 20);
		panelDeposit.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Arial Black", Font.PLAIN, 17));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(62, 117, 46, 14);
		panelDeposit.add(label);
		
		JPanel panelExtraction = new JPanel();
		tabbedPane.addTab("Extraccion", null, panelExtraction, null);
		panelExtraction.setLayout(null);
		
		JButton btnExtraer = new JButton("Extraer");
		btnExtraer.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnExtraer.setBounds(302, 56, 220, 122);
		panelExtraction.add(btnExtraer);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 107, 86, 20);
		panelExtraction.add(textField_1);
		
		JLabel label_1 = new JLabel("$");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 17));
		label_1.setBounds(62, 110, 46, 14);
		panelExtraction.add(label_1);
		
		JLabel lblOPuedesExtraer = new JLabel("O, puedes extraer todo el balance. T\u00FA eliges");
		lblOPuedesExtraer.setHorizontalAlignment(SwingConstants.CENTER);
		lblOPuedesExtraer.setBounds(0, 26, 532, 29);
		panelExtraction.add(lblOPuedesExtraer);
		
		JLabel lblPodrsExtraerLa = new JLabel("Podr\u00E1s extraer la cantida de dinero que deseas, luego presiona Extraer");
		lblPodrsExtraerLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodrsExtraerLa.setBounds(0, 0, 522, 29);
		panelExtraction.add(lblPodrsExtraerLa);
		
		JButton btnNewButton = new JButton("Extraer todo");
		btnNewButton.setBounds(19, 155, 248, 43);
		panelExtraction.add(btnNewButton);
		
		JPanel panelTransfer = new JPanel();
		tabbedPane.addTab("Transferencia", null, panelTransfer, null);
		panelTransfer.setLayout(null);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTransferir.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnTransferir.setBounds(350, 127, 172, 71);
		panelTransfer.add(btnTransferir);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 107, 86, 20);
		panelTransfer.add(textField_2);
		
		JLabel label_2 = new JLabel("$");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial Black", Font.PLAIN, 17));
		label_2.setBounds(10, 107, 46, 14);
		panelTransfer.add(label_2);
		
		JLabel lblPresionaTransferirRecuerda = new JLabel("Presiona Transferir... Recuerda revisar bien el monto...");
		lblPresionaTransferirRecuerda.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresionaTransferirRecuerda.setBounds(10, 140, 330, 29);
		panelTransfer.add(lblPresionaTransferirRecuerda);
		
		JLabel lblPrimeroNecesitamosLa = new JLabel("Primero necesitamos la ID de la persona a la cu\u00E1l quieres hacer la trasnferencia");
		lblPrimeroNecesitamosLa.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrimeroNecesitamosLa.setBounds(10, 0, 472, 29);
		panelTransfer.add(lblPrimeroNecesitamosLa);
		
		JLabel lblId = new JLabel("ID ");
		lblId.setFont(new Font("Arial", Font.PLAIN, 14));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(10, 26, 98, 30);
		panelTransfer.add(lblId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(111, 27, 411, 29);
		panelTransfer.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblIntroduceElMonto = new JLabel("Introduce el monto. El mismo ser\u00E1 debitado de tu cuenta");
		lblIntroduceElMonto.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntroduceElMonto.setBounds(10, 67, 491, 29);
		panelTransfer.add(lblIntroduceElMonto);
		
		JLabel lblPresionaTransferirRecuerda_1 = new JLabel("\u00A1 No te equivoques !");
		lblPresionaTransferirRecuerda_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresionaTransferirRecuerda_1.setBounds(66, 180, 157, 29);
		panelTransfer.add(lblPresionaTransferirRecuerda_1);
		
		JPanel panelPayment = new JPanel();
		tabbedPane.addTab("Pago", null, panelPayment, null);
		panelPayment.setLayout(null);
		
		JLabel lblPrimeroNecesitamosEl = new JLabel("Primero necesitamos el c\u00F3digo de la factura");
		lblPrimeroNecesitamosEl.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrimeroNecesitamosEl.setBounds(0, 0, 522, 29);
		panelPayment.add(lblPrimeroNecesitamosEl);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCdigo.setBounds(10, 26, 98, 30);
		panelPayment.add(lblCdigo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 27, 411, 29);
		panelPayment.add(textField_4);
		
		JLabel lblLuegoPresionaEn = new JLabel("Luego presiona en Pagar, nosostros nos encargamos de todo");
		lblLuegoPresionaEn.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuegoPresionaEn.setBounds(20, 67, 502, 29);
		panelPayment.add(lblLuegoPresionaEn);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnPagar.setBounds(145, 107, 220, 71);
		panelPayment.add(btnPagar);
		
		JPanel panelLog = new JPanel();
		tabbedPane.addTab("Registros", null, panelLog, null);
		panelWelcome.setLayout(null);
		{
			JLabel lblGreetings = new JLabel("\u00A1 Hola !");
			lblGreetings.setBounds(10, 11, 182, 23);
			panelWelcome.add(lblGreetings);
		}
		contentPanel.setLayout(gl_contentPanel);
	}
}
