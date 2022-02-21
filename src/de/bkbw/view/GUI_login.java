package de.bkbw.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUI_login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel loginPanel;
	private JPanel registerPanel;
	private JTextField txtEmail;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_login frame = new GUI_login();
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
	public GUI_login() {
		setTitle("Ticketverwaltungssystem");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 319);
		viewLogin();
		viewRegister();	
	}
	
	private void viewLogin() {
		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(loginPanel);
		loginPanel.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setBounds(114, 59, 250, 33);
		txtEmail.setBorder(new EmptyBorder(0, 0, 0, 0));
		loginPanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		txtPassword.setBounds(114, 128, 250, 30);
		txtPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		loginPanel.add(txtPassword);
		
		JLabel lblEmail = new JLabel("E-Mail\r\n");
		lblEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(114, 34, 190, 23);
		loginPanel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Passwort");
		lblPassword.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblPassword.setBounds(114, 103, 190, 23);
		loginPanel.add(lblPassword);
		
		JButton btnLogin = new JButton("Einloggen");
		btnLogin.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(114, 169, 120, 23);
		btnLogin.setBorder(new EmptyBorder(0, 0, 0, 0));
		loginPanel.add(btnLogin);
		
		JButton btnRegister = new JButton("Registrieren");
		btnRegister.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		btnRegister.setBounds(244, 169, 120, 23);
		loginPanel.add(btnRegister);
	}
	
	private void viewRegister() {
		registerPanel = new JPanel();
		registerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(registerPanel);
		registerPanel.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setBounds(114, 59, 250, 33);
		txtEmail.setBorder(new EmptyBorder(0, 0, 0, 0));
		registerPanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		txtPassword.setBounds(114, 128, 250, 30);
		txtPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		registerPanel.add(txtPassword);
		
		JLabel lblEmail = new JLabel("E-Mail\r\n");
		lblEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(114, 34, 190, 23);
		registerPanel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Passwort");
		lblPassword.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblPassword.setBounds(114, 103, 190, 23);
		registerPanel.add(lblPassword);
		
		JButton btnRegister = new JButton("Registrieren");
		btnRegister.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		btnRegister.setBounds(244, 169, 120, 23);
		registerPanel.add(btnRegister);
		
		JButton btnLogin = new JButton("Einloggen");
		btnLogin.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(114, 169, 120, 23);
		btnLogin.setBorder(new EmptyBorder(0, 0, 0, 0));
		registerPanel.add(btnLogin);
		
	}
}


