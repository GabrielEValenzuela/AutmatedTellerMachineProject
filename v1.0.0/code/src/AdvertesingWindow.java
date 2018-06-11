import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;

public class AdvertesingWindow {

	private JFrame AdvertesingWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertesingWindow window = new AdvertesingWindow();
					window.AdvertesingWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdvertesingWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdvertesingWindow = new JFrame("ATMSoftware");
		AdvertesingWindow.getContentPane().setBackground(Color.WHITE);
		AdvertesingWindow.setBounds(100, 100, 511, 442);
		AdvertesingWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdvertesingWindow.getContentPane().setLayout(null);
		
		JButton btnInsertCard = new JButton("Insertar tarjeta");
		btnInsertCard.setBounds(10, 352, 475, 40);
		AdvertesingWindow.getContentPane().add(btnInsertCard);
		
		JLabel lblAvd = new JLabel("");
		//Image img = new ImageIcon(this.getClass().getResource("/Adv.png")).getImage();
		//lblAvd.setIcon(new ImageIcon(img));
		lblAvd.setBounds(10, 11, 475, 330);
		AdvertesingWindow.getContentPane().add(lblAvd);
	}
}