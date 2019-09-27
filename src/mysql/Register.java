package mysql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {
	
	Connection con =null;
	PreparedStatement pst = null;

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
	private JTextField txtClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.setForeground(SystemColor.window);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(631, 0, 19, 22);
		contentPane.add(lblX);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setForeground(SystemColor.window);
		lblRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblRegister.setBounds(246, 13, 195, 43);
		contentPane.add(lblRegister);
		
		user = new JTextField();
		user.setBounds(270, 183, 208, 29);
		contentPane.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(274, 275, 204, 29);
		contentPane.add(pass);
		
		JLabel lblNewLabel = new JLabel("Enter Username");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(67, 189, 164, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Password");
		lblNewLabel_1.setForeground(SystemColor.window);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(67, 281, 171, 16);
		contentPane.add(lblNewLabel_1);
		
		txtClose = new JTextField();
		txtClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		txtClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtClose.setEditable(false);
		txtClose.setHorizontalAlignment(SwingConstants.CENTER);
		txtClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtClose.setText("Close");
		txtClose.setBounds(347, 415, 116, 29);
		contentPane.add(txtClose);
		txtClose.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "INSERT INTO `login`(`username`, `password`) VALUES (?,?292221235))";
					con = DriverManager.getConnection("jdbc:mysql://localhost/test/login","root","");
					pst=con.prepareStatement(query);
					pst.setString(1, user.getText());
					pst.setString(2, pass.getText());
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Registered Successfully!");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setBounds(84, 415, 116, 29);
		contentPane.add(btnRegister);
		
		setUndecorated(true);
	}
}
