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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel View_Login;
	private JTextField txtEmail;
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
		setBounds(100, 100, 464, 319);
		View_Login = new JPanel();
		View_Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(View_Login);
		View_Login.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setBounds(114, 59, 250, 33);
		View_Login.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(114, 128, 250, 30);
		View_Login.add(txtPassword);
		
		JLabel lblEmail = new JLabel("E-Mail\r\n");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(114, 34, 190, 23);
		View_Login.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Passwort");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPassword.setBounds(114, 103, 190, 23);
		View_Login.add(lblPassword);
		
		JButton btnLogin = new JButton("Einloggen");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(114, 169, 120, 23);
		View_Login.add(btnLogin);
		
		JButton btnRegister = new JButton("Registrieren");
		btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setBounds(244, 169, 120, 23);
		View_Login.add(btnRegister);
	}
}
