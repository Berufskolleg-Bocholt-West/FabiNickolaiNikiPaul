package de.bkbw.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class GUI_register {

	private JFrame frame;
	private JTextField textUsername;
	private JTextField textEmail;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_register window = new GUI_register();
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
	public GUI_register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 495, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textUsername = new JTextField();
		textUsername.setBounds(84, 60, 220, 20);
		textUsername.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(84, 120, 220, 20);
		textEmail.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(84, 180, 220, 20);
		textPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.getContentPane().add(textPassword);
		textPassword.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblPassword.setBounds(84, 155, 80, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblEmail.setBounds(84, 95, 80, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblUsername.setBounds(84, 35, 80, 14);
		frame.getContentPane().add(lblUsername);
		
		JButton btnBack_to = new JButton("Back to Login");
		btnBack_to.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnBack_to.setBounds(84, 230, 110, 23);
		frame.getContentPane().add(btnBack_to);
		
		JButton btnRegister = new JButton("Registrieren");
		btnRegister.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnRegister.setBounds(204, 230, 100, 23);
		frame.getContentPane().add(btnRegister);
	}
}
