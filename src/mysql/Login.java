package mysql;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField txtClose;
	private JLabel lblX;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setBounds(218, 128, 295, 30);
		contentPane.add(user);
		user.setColumns(10);
		
		txtClose = new JTextField();
		txtClose.setDisabledTextColor(new Color(255, 0, 0));
		txtClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		txtClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtClose.setEditable(false);
		txtClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtClose.setHorizontalAlignment(SwingConstants.CENTER);
		txtClose.setText("Close");
		txtClose.setBounds(410, 298, 103, 30);
		contentPane.add(txtClose);
		txtClose.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(UIManager.getColor("ComboBox.background"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(77, 134, 103, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(UIManager.getColor("ComboBox.background"));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(77, 233, 103, 16);
		contentPane.add(lblPassword);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(UIManager.getColor("ComboBox.background"));
		lblLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblLogin.setBounds(273, 32, 167, 60);
		contentPane.add(lblLogin);
		
		lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblX.setForeground(UIManager.getColor("TextField.background"));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(726, 0, 24, 23);
		contentPane.add(lblX);
		
		pass = new JPasswordField();
		pass.setBounds(218, 231, 295, 30);
		contentPane.add(pass);
		
		JLabel lblNewUserSign = new JLabel("NEW USER? SIGN UP");
		lblNewUserSign.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewUserSign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Register r = new Register();
				r.setVisible(true);
			}
		});
		lblNewUserSign.setForeground(SystemColor.window);
		lblNewUserSign.setBounds(548, 364, 133, 16);
		contentPane.add(lblNewUserSign);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					Statement stmt = con.createStatement();
					String sql = "Select * from login where username = '"+user.getText()+"'and password = '"+pass.getText()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login Successfully");	
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect Credentials");
					con.close();
				}catch(Exception e) {System.out.print(e);}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(218, 301, 97, 25);
		contentPane.add(btnLogin);
		
		setUndecorated(true);
	}
}
