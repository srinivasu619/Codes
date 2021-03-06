package com.example.jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class LoginPage {
	private static LoginPage window =null;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window= new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setOpacity(1.0f);
		frame.setBounds(100, 100, 452, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 13, 410, 611);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(true);
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		textField.setBounds(81, 273, 250, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 17));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				char[] pass=passwordField.getPassword();
				if(username==null||pass.length==0||pass==null)
				{
					JOptionPane.showMessageDialog(frame,"Complete the Fields.");
				}
				else
				{
					LoginCheck loginCheck=new LoginCheck(username,pass);
					boolean check=loginCheck.dataConn();
					if(check)
					{
						JOptionPane.showMessageDialog(frame,"LOGIN SUCCESSFUL");
					}
					else
					{
						JOptionPane.showMessageDialog(frame,"Wrong Username or Password");
					}
				}
			}
		});
		btnLogin.setBackground(new Color(245, 245, 220));
		btnLogin.setBounds(144, 443, 135, 35);
		panel.add(btnLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(245, 245, 220));
		lblUsername.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(82, 244, 125, 16);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(245, 245, 220));
		lblPassword.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setBounds(81, 336, 105, 16);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		passwordField.setBounds(81, 365, 250, 50);
		panel.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\SRINIVASU\\Desktop\\rsz_computer-1331579_640.png"));
		label.setBounds(61, 111, 75, 75);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("Not a member?Create an account");
		lblNewLabel.setFont(new Font("Source Sans Pro Light", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(245, 245, 220));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(81, 533, 250, 16);
		panel.add(lblNewLabel);
		lblNewLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel.setFont(new Font("Source Sans Pro Light", Font.BOLD, 15));	
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				//lblNewLabel.setForeground(new Color(255,255,255));
				//lblNewLabel.setBackground(new Color(245, 245, 220));
				lblNewLabel.setFont(new Font("Source Sans Pro Light", Font.ITALIC|Font.BOLD, 15));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
			}
		});
		
		JLabel lblAttendence = new JLabel("ATTENDENCE");
		lblAttendence.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttendence.setForeground(new Color(245, 245, 220));
		lblAttendence.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		lblAttendence.setBounds(144, 124, 181, 27);
		panel.add(lblAttendence);
		
		JLabel lblManager = new JLabel("MANAGER");
		lblManager.setForeground(new Color(245, 245, 220));
		lblManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblManager.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		lblManager.setBounds(144, 151, 173, 27);
		panel.add(lblManager);
	}
}
