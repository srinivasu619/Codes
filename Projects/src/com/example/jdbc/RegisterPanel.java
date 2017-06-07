package com.example.jdbc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisterPanel extends JPanel {

	/**
	 * Create the .
	 */
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
	public RegisterPanel(Component comp) {
		initialize(comp);
	}
	private void initialize(Component comp)
	{
		setBackground(Color.DARK_GRAY);
		setBounds(12, 13, 452, 683);
		setLayout(null);
		textField = new JTextField();
		textField.setBounds(81, 203, 250, 50);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 284, 250, 50);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 364, 250, 50);
		add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(81, 444, 250, 50);
		add(passwordField);
		
		lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(new Color(245, 245, 220));
		lblUsername.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(81, 180, 116, 16);
		add(lblUsername);
		
		lblEmailid = new JLabel("Email-Id");
		lblEmailid.setForeground(new Color(245, 245, 220));
		lblEmailid.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblEmailid.setBounds(81, 258, 99, 16);
		add(lblEmailid);
		
		lblCourse = new JLabel("COURSE");
		lblCourse.setForeground(new Color(245, 245, 220));
		lblCourse.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblCourse.setBounds(81, 339, 99, 16);
		add(lblCourse);
		
		lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setForeground(new Color(245, 245, 220));
		lblPassword.setBounds(81, 421, 99, 16);
		add(lblPassword);
		
		label = new JLabel("");
		label.setBounds(66, 65, 75, 75);
		label.setIcon(new ImageIcon("C:\\Users\\SRINIVASU\\Desktop\\rsz_computer-1331579_640.png"));
		add(label);
		
		label_1 = new JLabel("ATTENDENCE");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(245, 245, 220));
		label_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(153, 68, 181, 27);
		add(label_1);
		
		label_2 = new JLabel("MANAGER");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(245, 245, 220));
		label_2.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		label_2.setBounds(153, 93, 173, 27);
		add(label_2);
		
		btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 17));
		btnRegister.setBounds(146, 529, 135, 35);
		add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String emailid=textField_1.getText();
				String course=textField_2.getText();
				char[] pass=passwordField.getPassword();
				String password=pass.toString();
				if(username.equals("")||emailid.equals("")||course.equals("")||password.equals(""))
				{
					JOptionPane.showMessageDialog(comp, "Complete all Fields");
				}
				
				else
				{
					String pass1="";
					for(int i=0;i<pass.length;i++)
					{
						pass1+=pass[i];
					}
					RegisterCheck reg=new RegisterCheck(username, pass1, course, emailid);
					reg.dataInsert();
					JOptionPane.showMessageDialog(comp, "OK!!Succesful");
				}
			}
		});
	}
	}

