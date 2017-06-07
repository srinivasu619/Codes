package com.example.jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RegisterPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JLabel lblUsername;
	private JLabel lblEmailid;
	private JLabel lblCourse;
	private JLabel lblPassword;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton btnRegister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage window = new RegisterPage();
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
	public RegisterPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 13, 410, 611);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(81, 203, 250, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 284, 250, 50);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 364, 250, 50);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(81, 444, 250, 50);
		panel.add(passwordField);
		
		lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(new Color(245, 245, 220));
		lblUsername.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(81, 180, 116, 16);
		panel.add(lblUsername);
		
		lblEmailid = new JLabel("Email-Id");
		lblEmailid.setForeground(new Color(245, 245, 220));
		lblEmailid.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblEmailid.setBounds(81, 258, 99, 16);
		panel.add(lblEmailid);
		
		lblCourse = new JLabel("COURSE");
		lblCourse.setForeground(new Color(245, 245, 220));
		lblCourse.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblCourse.setBounds(81, 339, 99, 16);
		panel.add(lblCourse);
		
		lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setForeground(new Color(245, 245, 220));
		lblPassword.setBounds(81, 421, 99, 16);
		panel.add(lblPassword);
		
		label = new JLabel("");
		label.setBounds(66, 65, 75, 75);
		label.setIcon(new ImageIcon("C:\\Users\\SRINIVASU\\Desktop\\rsz_computer-1331579_640.png"));
		panel.add(label);
		
		label_1 = new JLabel("ATTENDENCE");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(245, 245, 220));
		label_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(153, 68, 181, 27);
		panel.add(label_1);
		
		label_2 = new JLabel("MANAGER");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(245, 245, 220));
		label_2.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		label_2.setBounds(153, 93, 173, 27);
		panel.add(label_2);
		
		btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 17));
		btnRegister.setBounds(146, 529, 135, 35);
		panel.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String emailid=textField_1.getText();
				String course=textField_2.getText();
				char[] pass=passwordField.getPassword();
				String password=pass.toString();
				if(username==null||emailid==null||course==null||password==null)
				{
					JOptionPane.showMessageDialog(frame, "Complete all Fields");
				}
				new RegisterCheck(username, password, course, emailid);
			}
		});
	}

}
