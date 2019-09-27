package mysql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Cursor;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGreensEmandi = new JLabel("GREEN'S e-MANDI");
		lblGreensEmandi.setForeground(new Color(34, 139, 34));
		lblGreensEmandi.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreensEmandi.setFont(new Font("Stencil", Font.BOLD, 30));
		lblGreensEmandi.setBounds(332, 13, 289, 48);
		frame.getContentPane().add(lblGreensEmandi);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\susha\\eclipse-workspace\\E-Mandi\\res\\img\\VEGGIES.jpg"));
		lblNewLabel.setBounds(102, 75, 781, 321);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea txtrWelcomeToGreens = new JTextArea();
		txtrWelcomeToGreens.setBackground(UIManager.getColor("Button.background"));
		txtrWelcomeToGreens.setFont(new Font("Sitka Small", Font.BOLD, 18));
		txtrWelcomeToGreens.setText("Welcome to Green's E-Mandi, your own online vegetable market. You can go\r\nthrough a number of vegetables which are available fresh and are \r\nsupplied directly from our farms.\r\nHappy shopinng!");
		txtrWelcomeToGreens.setBounds(102, 432, 781, 108);
		frame.getContentPane().add(txtrWelcomeToGreens);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login log = new Login();
				log.setVisible(true);
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBounds(693, 647, 190, 34);
		frame.getContentPane().add(btnLogin);
		
		JButton btnShop = new JButton("Shop!!");
		btnShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart ct = new cart();
				ct.setVisible(true);
			}
		});
		btnShop.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnShop.setBounds(693, 574, 192, 34);
		frame.getContentPane().add(btnShop);
	}
}
