package de.bkbw.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel View_Login;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Ticketverwaltungssystem");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		View_Login = new JPanel();
		View_Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(View_Login);
		View_Login.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBounds(114, 59, 190, 33);
		View_Login.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(114, 128, 190, 30);
		View_Login.add(txtPassword);
		
		JLabel lblUsername = new JLabel("Benutzername");
		lblUsername.setBounds(114, 34, 190, 14);
		View_Login.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Passwort");
		lblPassword.setBounds(114, 103, 190, 14);
		View_Login.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(114, 191, 190, 30);
		View_Login.add(btnLogin);
	}
}
