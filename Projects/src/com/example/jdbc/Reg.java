package com.example.jdbc;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Reg extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Reg() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 410, 611);
		add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(81, 203, 250, 50);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 284, 250, 50);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(81, 364, 250, 50);
		panel.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(81, 444, 250, 50);
		panel.add(passwordField);
		
		JLabel label = new JLabel("USERNAME");
		label.setForeground(new Color(245, 245, 220));
		label.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		label.setBounds(81, 180, 116, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Email-Id");
		label_1.setForeground(new Color(245, 245, 220));
		label_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		label_1.setBounds(81, 258, 99, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("COURSE");
		label_2.setForeground(new Color(245, 245, 220));
		label_2.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		label_2.setBounds(81, 339, 99, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("PASSWORD");
		label_3.setForeground(new Color(245, 245, 220));
		label_3.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		label_3.setBounds(81, 421, 99, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(66, 65, 75, 75);
		label_4.setIcon(new ImageIcon("C:\\Users\\SRINIVASU\\Desktop\\rsz_computer-1331579_640.png"));
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("ATTENDENCE");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(245, 245, 220));
		label_5.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		label_5.setBounds(153, 68, 181, 27);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("MANAGER");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(245, 245, 220));
		label_6.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 25));
		label_6.setBounds(153, 93, 173, 27);
		panel.add(label_6);
		
		JButton button = new JButton("REGISTER");
		button.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 17));
		button.setBounds(146, 529, 135, 35);
		panel.add(button);

	}

}
