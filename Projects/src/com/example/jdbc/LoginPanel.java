package com.example.jdbc;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	Component component;
	private JTextField textField;
	private JPasswordField passwordField;
	LoginPanel(Component comp) {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		textField.setBounds(81, 273, 250, 50);
		add(textField);
		textField.setColumns(10);
		//RegisterPanel registerPanel=new RegisterPanel(comp);
		//add(registerPanel);
		//registerPanel.setVisible(false);
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 17));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				char[] pass=passwordField.getPassword();
				if(username==null||pass.length==0||pass==null)
				{
					JOptionPane.showMessageDialog(comp,"Complete the Fields.");
				}
				else
				{
					LoginCheck loginCheck=new LoginCheck(username,pass);
					boolean check=loginCheck.dataConn();
					if(check)
					{
						JOptionPane.showMessageDialog(comp,"LOGIN SUCCESSFUL");
					}
					else
					{
						JOptionPane.showMessageDialog(comp,"Wrong Username or Password");
					}
				}
			}
		});
		btnLogin.setBackground(new Color(245, 245, 220));
		btnLogin.setBounds(144, 443, 135, 35);
		add(btnLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(245, 245, 220));
		lblUsername.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(82, 244, 125, 16);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(245, 245, 220));
		lblPassword.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setBounds(81, 336, 105, 16);
		add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		passwordField.setBounds(81, 365, 250, 50);
		add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\SRINIVASU\\Desktop\\rsz_computer-1331579_640.png"));
		label.setBounds(61, 111, 75, 75);
		add(label);
		JLabel lblAttendence = new JLabel("ATTENDENCE");
		lblAttendence.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttendence.setForeground(new Color(245, 245, 220));
		lblAttendence.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		lblAttendence.setBounds(144, 124, 181, 27);
		add(lblAttendence);
		
		JLabel lblManager = new JLabel("MANAGER");
		lblManager.setForeground(new Color(245, 245, 220));
		lblManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblManager.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		lblManager.setBounds(144, 151, 173, 27);
		add(lblManager);
		
		JLabel lblJjcgj = new JLabel("Not a Member? Create an account");
		lblJjcgj.setForeground(new Color(245, 245, 220));
		lblJjcgj.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblJjcgj.setHorizontalAlignment(SwingConstants.CENTER);
		lblJjcgj.setBounds(81, 537, 268, 16);
		add(lblJjcgj);
		lblJjcgj.addMouseListener(new MouseListener() {
			
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
				lblJjcgj.setForeground(new Color(245, 245, 220));
				lblJjcgj.setFont(new Font("Stencil", Font.PLAIN, 13));			
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				lblJjcgj.setForeground(new Color(245, 245, 220));
				lblJjcgj.setFont(new Font("Stencil", Font.ITALIC, 15));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("clicked");
				Test3 test3=new Test3();
				test3.next();
			}
		});
		
	}
}
