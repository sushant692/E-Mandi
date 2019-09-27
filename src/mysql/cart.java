package mysql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class cart extends JFrame {

	String iSubtotal,iGst,iTotal;
	double [] itemcost = new double[22];
	
	private JPanel contentPane;
	private JTextField txtTomato;
	private JTextField txtCabbage;
	private JTextField txtCauliflower;
	private JTextField txtRadish;
	private JTextField txtCucumber;
	private JTextField txtGreenchilli;
	private JTextField txtGarlic;
	private JTextField txtPumpkin;
	private JTextField txtOkra;
	private JTextField txtSubt;
	private JTextField txtGst;
	private JTextField txtTotal;
	private JTextField txtPotato;
	private JTextField txtOnion;
	private JTextField txtSpinach;
	private JTextField txtCarrot;
	private JTextField txtCapsicum;
	private JTextField txtCoriander;
	private JTextField txtGinger;
	private JTextField txtLemon;
	private JTextField txtBeetroot;
	
	private JFrame frame;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cart frame = new cart();
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
	public cart() {
		setTitle("cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1250, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(10, 2, 3, 3));
		
		JLabel lblNewLabel = new JLabel("ITEMS");
		lblNewLabel.setBackground(UIManager.getColor("Button.highlight"));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 24));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_4 = new JButton("Potato");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtPotato.setEnabled(true);
			}
		});

		btnNewButton_4.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_4.setPreferredSize(new Dimension(89, 19));
		btnNewButton_4.setMinimumSize(new Dimension(85, 16));
		btnNewButton_4.setMaximumSize(new Dimension(85, 16));
		btnNewButton_4.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_4.setLocation(new Point(4, 2));
		btnNewButton_4.setIconTextGap(3);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_4.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_4.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Cabbage");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCabbage.setEnabled(true);
			}
		});
		btnNewButton_5.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_5.setPreferredSize(new Dimension(89, 19));
		btnNewButton_5.setMinimumSize(new Dimension(85, 16));
		btnNewButton_5.setMaximumSize(new Dimension(85, 16));
		btnNewButton_5.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_5.setLocation(new Point(4, 2));
		btnNewButton_5.setIconTextGap(3);
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_5.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_5.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Onion");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtOnion.setEnabled(true);
			}
		});
		btnNewButton_6.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_6.setPreferredSize(new Dimension(89, 19));
		btnNewButton_6.setMinimumSize(new Dimension(85, 16));
		btnNewButton_6.setMaximumSize(new Dimension(85, 16));
		btnNewButton_6.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_6.setLocation(new Point(4, 2));
		btnNewButton_6.setIconTextGap(3);
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_6.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_6.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Tomato");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtTomato.setEnabled(true);
			}
		});
		btnNewButton_7.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_7.setPreferredSize(new Dimension(89, 19));
		btnNewButton_7.setMinimumSize(new Dimension(85, 16));
		btnNewButton_7.setMaximumSize(new Dimension(85, 16));
		btnNewButton_7.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_7.setLocation(new Point(4, 2));
		btnNewButton_7.setIconTextGap(3);
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_7.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_7.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_7.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("Spinach");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtSpinach.setEnabled(true);
			}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton.setPreferredSize(new Dimension(89, 19));
		btnNewButton.setMinimumSize(new Dimension(85, 16));
		btnNewButton.setMaximumSize(new Dimension(85, 16));
		btnNewButton.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton.setLocation(new Point(4, 2));
		btnNewButton.setIconTextGap(3);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton);
		
		JButton btnNewButton_9 = new JButton("Cauliflower");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCauliflower.setEnabled(true);
			}
		});
		btnNewButton_9.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_9.setPreferredSize(new Dimension(89, 19));
		btnNewButton_9.setMinimumSize(new Dimension(85, 16));
		btnNewButton_9.setMaximumSize(new Dimension(85, 16));
		btnNewButton_9.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_9.setLocation(new Point(4, 2));
		btnNewButton_9.setIconTextGap(3);
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_9.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_9.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Carrot");
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCarrot.setEnabled(true);
			}
		});
		btnNewButton_10.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_10.setPreferredSize(new Dimension(89, 19));
		btnNewButton_10.setMinimumSize(new Dimension(85, 16));
		btnNewButton_10.setMaximumSize(new Dimension(85, 16));
		btnNewButton_10.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_10.setLocation(new Point(4, 2));
		btnNewButton_10.setIconTextGap(3);
		btnNewButton_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_10.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_10.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_10.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_10.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_10.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_8 = new JButton("Radish");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtPotato.setEnabled(true);
			}
		});
		btnNewButton_8.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_8.setPreferredSize(new Dimension(89, 19));
		btnNewButton_8.setMinimumSize(new Dimension(85, 16));
		btnNewButton_8.setMaximumSize(new Dimension(85, 16));
		btnNewButton_8.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_8.setLocation(new Point(4, 2));
		btnNewButton_8.setIconTextGap(3);
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_8.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_8.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_8.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("Capsicum");
		btnNewButton_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCapsicum.setEnabled(true);
			}
		});
		btnNewButton_12.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_12.setPreferredSize(new Dimension(89, 19));
		btnNewButton_12.setMinimumSize(new Dimension(85, 16));
		btnNewButton_12.setMaximumSize(new Dimension(85, 16));
		btnNewButton_12.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_12.setLocation(new Point(4, 2));
		btnNewButton_12.setIconTextGap(3);
		btnNewButton_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_12.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_12.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_12.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_12.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_12.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("Cucumber");
		btnNewButton_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCucumber.setEnabled(true);
			}
		});
		btnNewButton_14.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_14.setPreferredSize(new Dimension(89, 19));
		btnNewButton_14.setMinimumSize(new Dimension(85, 16));
		btnNewButton_14.setMaximumSize(new Dimension(85, 16));
		btnNewButton_14.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_14.setLocation(new Point(4, 2));
		btnNewButton_14.setIconTextGap(3);
		btnNewButton_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_14.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_14.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_14.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_14.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_14.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_11 = new JButton("Coriander");
		btnNewButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCoriander.setEnabled(true);
			}
		});
		btnNewButton_11.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_11.setPreferredSize(new Dimension(89, 19));
		btnNewButton_11.setMinimumSize(new Dimension(85, 16));
		btnNewButton_11.setMaximumSize(new Dimension(85, 16));
		btnNewButton_11.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_11.setLocation(new Point(4, 2));
		btnNewButton_11.setIconTextGap(3);
		btnNewButton_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_11.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_11.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_11.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_11.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_11.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_16 = new JButton("Green Chilli");
		btnNewButton_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtGreenchilli.setEnabled(true);
			}
		});
		btnNewButton_16.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_16.setPreferredSize(new Dimension(89, 19));
		btnNewButton_16.setMinimumSize(new Dimension(85, 16));
		btnNewButton_16.setMaximumSize(new Dimension(85, 16));
		btnNewButton_16.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_16.setLocation(new Point(4, 2));
		btnNewButton_16.setIconTextGap(3);
		btnNewButton_16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_16.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_16.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_16.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_16.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_16.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_13 = new JButton("Ginger");
		btnNewButton_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtGinger.setEnabled(true);
			}
		});
		btnNewButton_13.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_13.setPreferredSize(new Dimension(89, 19));
		btnNewButton_13.setMinimumSize(new Dimension(85, 16));
		btnNewButton_13.setMaximumSize(new Dimension(85, 16));
		btnNewButton_13.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_13.setLocation(new Point(4, 2));
		btnNewButton_13.setIconTextGap(3);
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_13.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_13.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_13.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_13.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_13.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_18 = new JButton("Garlic");
		btnNewButton_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtGarlic.setEnabled(true);
			}
		});
		btnNewButton_18.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_18.setPreferredSize(new Dimension(89, 19));
		btnNewButton_18.setMinimumSize(new Dimension(85, 16));
		btnNewButton_18.setMaximumSize(new Dimension(85, 16));
		btnNewButton_18.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_18.setLocation(new Point(4, 2));
		btnNewButton_18.setIconTextGap(3);
		btnNewButton_18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_18.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_18.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_18.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_18.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_18.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_1 = new JButton("Lemon");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtLemon.setEnabled(true);
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_1.setPreferredSize(new Dimension(89, 19));
		btnNewButton_1.setMinimumSize(new Dimension(85, 16));
		btnNewButton_1.setMaximumSize(new Dimension(85, 16));
		btnNewButton_1.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_1.setLocation(new Point(4, 2));
		btnNewButton_1.setIconTextGap(3);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_1.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_1.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_15 = new JButton("Pumpkin");
		btnNewButton_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtPumpkin.setEnabled(true);
			}
		});
		btnNewButton_15.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_15.setPreferredSize(new Dimension(89, 19));
		btnNewButton_15.setMinimumSize(new Dimension(85, 16));
		btnNewButton_15.setMaximumSize(new Dimension(85, 16));
		btnNewButton_15.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_15.setLocation(new Point(4, 2));
		btnNewButton_15.setIconTextGap(3);
		btnNewButton_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_15.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_15.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_15.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_15.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_15.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_2 = new JButton("Beetroot");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtBeetroot.setEnabled(true);
			}
		});
		btnNewButton_2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_2.setPreferredSize(new Dimension(89, 19));
		btnNewButton_2.setMinimumSize(new Dimension(85, 16));
		btnNewButton_2.setMaximumSize(new Dimension(85, 16));
		btnNewButton_2.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_2.setLocation(new Point(4, 2));
		btnNewButton_2.setIconTextGap(3);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_2.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_2.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_17 = new JButton("Okra");
		btnNewButton_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtOkra.setEnabled(true);
			}
		});
		btnNewButton_17.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton_17.setPreferredSize(new Dimension(89, 19));
		btnNewButton_17.setMinimumSize(new Dimension(85, 16));
		btnNewButton_17.setMaximumSize(new Dimension(85, 16));
		btnNewButton_17.setMargin(new Insets(10, 14, 10, 14));
		btnNewButton_17.setLocation(new Point(4, 2));
		btnNewButton_17.setIconTextGap(3);
		btnNewButton_17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_17.setBounds(new Rectangle(2, 1, 4, 1));
		btnNewButton_17.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_17.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_17.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_17.setBackground(new Color(245, 245, 245));
		panel.add(btnNewButton_17);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 1, 1));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(10, 1, 0, 30));
		
		JLabel lblQuantity = new JLabel("QUANT");
		lblQuantity.setMinimumSize(new Dimension(41, 20));
		lblQuantity.setMaximumSize(new Dimension(41, 20));
		lblQuantity.setFont(new Font("Sitka Small", Font.BOLD, 25));
		panel_3.add(lblQuantity);
		
		JCheckBox chkPotato = new JCheckBox("Potato");
		chkPotato.setHideActionText(true);
		chkPotato.setForeground(new Color(0, 0, 0));
		chkPotato.setMargin(new Insets(27, 0, 27, 0));
		chkPotato.setLocation(new Point(2, 2));
		chkPotato.setIconTextGap(5);
		chkPotato.setHorizontalAlignment(SwingConstants.LEFT);
		chkPotato.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkPotato);
		
		JCheckBox chkOnion = new JCheckBox("Onion");
		chkOnion.setHideActionText(true);
		chkOnion.setForeground(new Color(0, 0, 0));
		chkOnion.setHorizontalAlignment(SwingConstants.LEFT);
		chkOnion.setMargin(new Insets(27, 0, 27, 0));
		chkOnion.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkOnion);
		
		JCheckBox chkSpinach = new JCheckBox("Spinach");
		chkSpinach.setHideActionText(true);
		chkSpinach.setForeground(new Color(0, 0, 0));
		chkSpinach.setHorizontalAlignment(SwingConstants.LEFT);
		chkSpinach.setMargin(new Insets(27, 0, 27, 0));
		chkSpinach.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkSpinach);
		
		JCheckBox chkCarrot = new JCheckBox("Carrot");
		chkCarrot.setHideActionText(true);
		chkCarrot.setForeground(new Color(0, 0, 0));
		chkCarrot.setHorizontalAlignment(SwingConstants.LEFT);
		chkCarrot.setMargin(new Insets(27, 0, 27, 0));
		chkCarrot.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkCarrot);
		
		JCheckBox chkCapsicum = new JCheckBox("Capsicum");
		chkCapsicum.setHideActionText(true);
		chkCapsicum.setForeground(new Color(0, 0, 0));
		chkCapsicum.setHorizontalAlignment(SwingConstants.LEFT);
		chkCapsicum.setMargin(new Insets(27, 0, 27, 0));
		chkCapsicum.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkCapsicum);
		
		JCheckBox chkCoriander = new JCheckBox("Coriander");
		chkCoriander.setHideActionText(true);
		chkCoriander.setForeground(new Color(0, 0, 0));
		chkCoriander.setHorizontalAlignment(SwingConstants.LEFT);
		chkCoriander.setMargin(new Insets(27, 0, 27, 0));
		chkCoriander.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkCoriander);
		
		JCheckBox chkGinger = new JCheckBox("Ginger");
		chkGinger.setHideActionText(true);
		chkGinger.setForeground(new Color(0, 0, 0));
		chkGinger.setHorizontalAlignment(SwingConstants.LEFT);
		chkGinger.setMargin(new Insets(27, 0, 27, 0));
		chkGinger.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkGinger);
		
		JCheckBox chkLemon = new JCheckBox("Lemon");
		chkLemon.setHideActionText(true);
		chkLemon.setForeground(new Color(0, 0, 0));
		chkLemon.setHorizontalAlignment(SwingConstants.LEFT);
		chkLemon.setMargin(new Insets(27, 0, 27, 0));
		chkLemon.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkLemon);
		
		JCheckBox chkBeetroot = new JCheckBox("Beetroot");
		chkBeetroot.setHideActionText(true);
		chkBeetroot.setForeground(new Color(0, 0, 0));
		chkBeetroot.setHorizontalAlignment(SwingConstants.LEFT);
		chkBeetroot.setMargin(new Insets(27, 0, 27, 0));
		chkBeetroot.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_3.add(chkBeetroot);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(10, 1, 1, 30));
		
		JLabel lblNewLabel_1 = new JLabel("ITY");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 25));
		lblNewLabel_1.setPreferredSize(new Dimension(100, 40));
		lblNewLabel_1.setMinimumSize(new Dimension(56, 30));
		lblNewLabel_1.setMaximumSize(new Dimension(72, 45));
		panel_4.add(lblNewLabel_1);
		
		txtPotato = new JTextField();
		txtPotato.setEnabled(false);
		txtPotato.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPotato.setHorizontalAlignment(SwingConstants.CENTER);
		txtPotato.setText("0");
		panel_4.add(txtPotato);
		txtPotato.setColumns(10);
		
		
		txtOnion = new JTextField();
		txtOnion.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtOnion.setEnabled(false);
		txtOnion.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnion.setText("0");
		panel_4.add(txtOnion);
		txtOnion.setColumns(10);
		
		txtSpinach = new JTextField();
		txtSpinach.setEnabled(false);
		txtSpinach.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSpinach.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpinach.setText("0");
		panel_4.add(txtSpinach);
		txtSpinach.setColumns(10);
		
		txtCarrot = new JTextField();
		txtCarrot.setEnabled(false);
		txtCarrot.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCarrot.setHorizontalAlignment(SwingConstants.CENTER);
		txtCarrot.setText("0");
		panel_4.add(txtCarrot);
		txtCarrot.setColumns(10);
		
		txtCapsicum = new JTextField();
		txtCapsicum.setEnabled(false);
		txtCapsicum.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCapsicum.setHorizontalAlignment(SwingConstants.CENTER);
		txtCapsicum.setText("0");
		panel_4.add(txtCapsicum);
		txtCapsicum.setColumns(10);
		
		txtCoriander = new JTextField();
		txtCoriander.setEnabled(false);
		txtCoriander.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCoriander.setHorizontalAlignment(SwingConstants.CENTER);
		txtCoriander.setText("0");
		panel_4.add(txtCoriander);
		txtCoriander.setColumns(10);
		
		txtGinger = new JTextField();
		txtGinger.setEnabled(false);
		txtGinger.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtGinger.setHorizontalAlignment(SwingConstants.CENTER);
		txtGinger.setText("0");
		panel_4.add(txtGinger);
		txtGinger.setColumns(10);
		
		txtLemon = new JTextField();
		txtLemon.setEnabled(false);
		txtLemon.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLemon.setHorizontalAlignment(SwingConstants.CENTER);
		txtLemon.setText("0");
		panel_4.add(txtLemon);
		txtLemon.setColumns(10);
		
		txtBeetroot = new JTextField();
		txtBeetroot.setEnabled(false);
		txtBeetroot.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtBeetroot.setText("0");
		txtBeetroot.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(txtBeetroot);
		txtBeetroot.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(10, 1, 0, 35));
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel_5.add(lblNewLabel_2);
		
		JCheckBox chkCabbage = new JCheckBox("Cabbage");
		chkCabbage.setHideActionText(true);
		chkCabbage.setHorizontalAlignment(SwingConstants.LEFT);
		chkCabbage.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkCabbage);
		
		JCheckBox chkTomato = new JCheckBox("Tomato");
		chkTomato.setHideActionText(true);
		chkTomato.setHorizontalAlignment(SwingConstants.LEFT);
		chkTomato.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkTomato);
		
		JCheckBox chkCauliflower = new JCheckBox("Cauliflower");
		chkCauliflower.setHideActionText(true);
		chkCauliflower.setHorizontalAlignment(SwingConstants.LEFT);
		chkCauliflower.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkCauliflower);
		
		JCheckBox chkRadish = new JCheckBox("Radish");
		chkRadish.setHideActionText(true);
		chkRadish.setHorizontalAlignment(SwingConstants.LEFT);
		chkRadish.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkRadish);
		
		JCheckBox chkCucumber = new JCheckBox("Cucumber");
		chkCucumber.setHideActionText(true);
		chkCucumber.setHorizontalAlignment(SwingConstants.LEFT);
		chkCucumber.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkCucumber);
		
		JCheckBox chkGreenchilli = new JCheckBox("Green Chilli");
		chkGreenchilli.setHideActionText(true);
		chkGreenchilli.setHorizontalAlignment(SwingConstants.LEFT);
		chkGreenchilli.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkGreenchilli);
		
		JCheckBox chkGarlic = new JCheckBox("Garlic");
		chkGarlic.setHideActionText(true);
		chkGarlic.setHorizontalAlignment(SwingConstants.LEFT);
		chkGarlic.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkGarlic);
		
		JCheckBox chkPumpkin = new JCheckBox("Pumpkin");
		chkPumpkin.setHideActionText(true);
		chkPumpkin.setHorizontalAlignment(SwingConstants.LEFT);
		chkPumpkin.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkPumpkin);
		
		JCheckBox chkOkra = new JCheckBox("Okra");
		chkOkra.setHideActionText(true);
		chkOkra.setHorizontalAlignment(SwingConstants.LEFT);
		chkOkra.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		panel_5.add(chkOkra);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(10, 1, 0, 30));
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_6.add(lblNewLabel_3);
		
		txtCabbage = new JTextField();
		txtCabbage.setEnabled(false);
		txtCabbage.setText("0");
		txtCabbage.setHorizontalAlignment(SwingConstants.CENTER);
		txtCabbage.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtCabbage);
		txtCabbage.setColumns(10);
		
		txtTomato = new JTextField();
		txtTomato.setEnabled(false);
		txtTomato.setText("0");
		txtTomato.setHorizontalAlignment(SwingConstants.CENTER);
		txtTomato.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtTomato);
		txtTomato.setColumns(10);
		
		txtCauliflower = new JTextField();
		txtCauliflower.setEnabled(false);
		txtCauliflower.setText("0");
		txtCauliflower.setHorizontalAlignment(SwingConstants.CENTER);
		txtCauliflower.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtCauliflower);
		txtCauliflower.setColumns(10);
		
		txtRadish = new JTextField();
		txtRadish.setEnabled(false);
		txtRadish.setText("0");
		txtRadish.setHorizontalAlignment(SwingConstants.CENTER);
		txtRadish.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtRadish);
		txtRadish.setColumns(10);
		
		txtCucumber = new JTextField();
		txtCucumber.setEnabled(false);
		txtCucumber.setText("0");
		txtCucumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtCucumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtCucumber);
		txtCucumber.setColumns(10);
		
		txtGreenchilli = new JTextField();
		txtGreenchilli.setEnabled(false);
		txtGreenchilli.setText("0");
		txtGreenchilli.setHorizontalAlignment(SwingConstants.CENTER);
		txtGreenchilli.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtGreenchilli);
		txtGreenchilli.setColumns(10);
		
		txtGarlic = new JTextField();
		txtGarlic.setEnabled(false);
		txtGarlic.setText("0");
		txtGarlic.setHorizontalAlignment(SwingConstants.CENTER);
		txtGarlic.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtGarlic);
		txtGarlic.setColumns(10);
		
		txtPumpkin = new JTextField();
		txtPumpkin.setEnabled(false);
		txtPumpkin.setText("0");
		txtPumpkin.setHorizontalAlignment(SwingConstants.CENTER);
		txtPumpkin.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtPumpkin);
		txtPumpkin.setColumns(10);
		
		txtOkra = new JTextField();
		txtOkra.setEnabled(false);
		txtOkra.setHorizontalAlignment(SwingConstants.CENTER);
		txtOkra.setText("0");
		txtOkra.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(txtOkra);
		txtOkra.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBilling = new JLabel("BILLING");
		lblBilling.setFont(new Font("Sitka Small", Font.BOLD, 24));
		lblBilling.setBounds(0, 13, 117, 41);
		panel_2.add(lblBilling);
		
		JLabel lblNewLabel_5 = new JLabel("Subtotal");
		lblNewLabel_5.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_5.setBounds(61, 110, 97, 22);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("GST(5%)");
		lblNewLabel_6.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_6.setBounds(61, 183, 77, 22);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Total");
		lblNewLabel_7.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_7.setBounds(61, 262, 56, 22);
		panel_2.add(lblNewLabel_7);
		
		txtSubt = new JTextField();
		txtSubt.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubt.setText("0");
		txtSubt.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSubt.setBounds(215, 106, 116, 26);
		panel_2.add(txtSubt);
		txtSubt.setColumns(10);
		
		txtGst = new JTextField();
		txtGst.setHorizontalAlignment(SwingConstants.CENTER);
		txtGst.setText("0");
		txtGst.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtGst.setBounds(215, 179, 116, 26);
		panel_2.add(txtGst);
		txtGst.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setText("0");
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTotal.setBounds(215, 258, 116, 26);
		panel_2.add(txtTotal);
		txtTotal.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 345, 381, 246);
		panel_2.add(textArea);
		
		JButton btnNewButton_3 = new JButton("Total");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setHideActionText(true);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemcost[0] = Double.parseDouble(txtPotato.getText())*30;
				itemcost[1] = Double.parseDouble(txtOnion.getText())*50;
				itemcost[2] = Double.parseDouble(txtSpinach.getText())*15;
				itemcost[3] = Double.parseDouble(txtCarrot.getText())*45;
				itemcost[4] = Double.parseDouble(txtCapsicum.getText())*60;
				itemcost[5] = Double.parseDouble(txtCoriander.getText())*15;
				
				itemcost[6] = Double.parseDouble(txtGinger.getText())*35;
				itemcost[7] = Double.parseDouble(txtLemon.getText())*5;
				itemcost[8] = Double.parseDouble(txtBeetroot.getText())*50;
				itemcost[9] = Double.parseDouble(txtCabbage.getText())*25;
				itemcost[10] = Double.parseDouble(txtTomato.getText())*30;
				itemcost[11] = Double.parseDouble(txtCauliflower.getText())*25;
				itemcost[12] = Double.parseDouble(txtRadish.getText())*20;
				itemcost[13] = Double.parseDouble(txtCucumber.getText())*40;
				itemcost[14] = Double.parseDouble(txtGreenchilli.getText())*60;
				itemcost[15] = Double.parseDouble(txtGarlic.getText())*80;
				itemcost[16] = Double.parseDouble(txtPumpkin.getText())*95;
				itemcost[17] = Double.parseDouble(txtOkra.getText())*30;
				
				itemcost[18] = itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4]+itemcost[5]+itemcost[6]+itemcost[7]+itemcost[8]+itemcost[9];
				itemcost[19] = itemcost[10]+itemcost[11]+itemcost[12]+itemcost[13]+itemcost[14]+itemcost[15]+itemcost[16]+itemcost[17];
				itemcost[20] = itemcost[18]+itemcost[19];
				
				iGst = String.format("Rs %.2f", itemcost[20]/100);
				iSubtotal = String.format("Rs %.2f", itemcost[20]);
				iTotal = String.format("Rs %.2f", itemcost[20]+(itemcost[20]/100));
				
				txtGst.setText(iGst);
				txtSubt.setText(iSubtotal);
				txtTotal.setText(iTotal);
				
				//===================================Receipt================================
				
				textArea.setEnabled(true);
				//=======================================================================
				int refs = 1325 + (int) (Math.random()*4238);
				
				//========================================================================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				Tdate.format(timer.getTime());
				//=========================================================================
				textArea.append("\tShopping Cart\n"+
				"Reference:\t\t\t"+refs+
				"\n==================================================\t"+
				
						"\n==================================================\t"+
						"\nGST:\t\t\t" + iGst +
						"\nSubtotal:\t\t\t" + iSubtotal +
						"\nTotal:\t\t\t" + iTotal +
						"\n==========================================\t"+
						"\nDate: "+Tdate.format(timer.getTime())+
						"\t\tTime: "+tTime.format(timer.getTime())+
						"\n\n\tThank You for shopping! Visit again!!\n");
				
			}
		});
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton_3.setBounds(12, 660, 97, 41);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_19 = new JButton("Reset");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText("");
				textArea.setEnabled(false);
				txtPotato.setText("0");
				txtOnion.setText("0");
				txtSpinach.setText("0");
				txtCarrot.setText("0");
				txtCapsicum.setText("0");
				txtCoriander.setText("0");
				txtGinger.setText("0");
				txtLemon.setText("0");
				txtBeetroot.setText("0");
				txtTomato.setText("0");
				txtCabbage.setText("0");
				txtCauliflower.setText("0");
				txtRadish.setText("0");
				txtCucumber.setText("0");
				txtGreenchilli.setText("0");
				txtGarlic.setText("0");
				txtPumpkin.setText("0");
				txtOkra.setText("0");
				txtGst.setText("0");
				txtSubt.setText("0");
				txtTotal.setText("0");
				
				txtPotato.setEnabled(false);
				txtOnion.setEnabled(false);
				txtSpinach.setEnabled(false);
				txtCarrot.setEnabled(false);
				txtCapsicum.setEnabled(false);
				txtCoriander.setEnabled(false);
				txtGinger.setEnabled(false);
				txtLemon.setEnabled(false);
				txtBeetroot.setEnabled(false);
				txtTomato.setEnabled(false);
				txtCabbage.setEnabled(false);
				txtCauliflower.setEnabled(false);
				txtRadish.setEnabled(false);
				txtCucumber.setEnabled(false);
				txtGreenchilli.setEnabled(false);
				txtGarlic.setEnabled(false);
				txtPumpkin.setEnabled(false);
				txtOkra.setEnabled(false);
				
				chkCarrot.setSelected(false);
				chkPotato.setSelected(false);
				chkOnion.setSelected(false);
				chkSpinach.setSelected(false);
				chkBeetroot.setSelected(false);
				chkCapsicum.setSelected(false);
				chkCoriander.setSelected(false);
				chkGinger.setSelected(false);
				chkLemon.setSelected(false);
				chkCabbage.setSelected(false);
				chkTomato.setSelected(false);
				chkCauliflower.setSelected(false);
				chkRadish.setSelected(false);
				chkCucumber.setSelected(false);
				chkGreenchilli.setSelected(false);
				chkGarlic.setSelected(false);
				chkPumpkin.setSelected(false);
				chkOkra.setSelected(false);
				
				chkCarrot.setEnabled(false);
				chkPotato.setEnabled(false);
				chkOnion.setEnabled(false);
				chkSpinach.setEnabled(false);
				chkBeetroot.setEnabled(false);
				chkCapsicum.setEnabled(false);
				chkCoriander.setEnabled(false);
				chkGinger.setEnabled(false);
				chkLemon.setEnabled(false);
				chkCabbage.setEnabled(false);
				chkTomato.setEnabled(false);
				chkCauliflower.setEnabled(false);
				chkRadish.setEnabled(false);
				chkCucumber.setEnabled(false);
				chkGreenchilli.setEnabled(false);
				chkGarlic.setEnabled(false);
				chkPumpkin.setEnabled(false);
				chkOkra.setEnabled(false);
				
				
			}
		});
		btnNewButton_19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_19.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton_19.setBounds(151, 660, 97, 41);
		panel_2.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("Close");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame("Close");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "cart",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
			System.exit(0);
		}
			}
		});
		btnNewButton_20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_20.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton_20.setBounds(296, 660, 97, 41);
		panel_2.add(btnNewButton_20);
	}
}
