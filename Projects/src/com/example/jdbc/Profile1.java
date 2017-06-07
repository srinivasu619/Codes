package com.example.jdbc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Profile1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile1 window = new Profile1();
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
	public Profile1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setOpacity(1.0f);
		frame.setBounds(100, 100, 458, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(164, 44, 267, 98);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(12, 13, 56, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(12, 42, 56, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(12, 69, 56, 16);
		panel.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(12, 189, 420, 76);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 13, 56, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(12, 42, 56, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(117, 26, 56, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel label_3 = new JLabel("%");
		label_3.setBounds(184, 26, 12, 16);
		panel_1.add(label_3);
		
		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOff.setBackground(Color.DARK_GRAY);
		btnOff.setForeground(new Color(245, 245, 220));
		btnOff.setBounds(204, 22, 56, 25);
		panel_1.add(btnOff);
		
		JButton btnBunk = new JButton("BUNK");
		btnBunk.setBackground(Color.DARK_GRAY);
		btnBunk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBunk.setBounds(269, 22, 63, 25);
		btnBunk.setForeground(new Color(245, 245, 220));
		panel_1.add(btnBunk);
		
		JButton btnNewButton = new JButton("ATTEND");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(340, 23, 75, 25);
		btnNewButton.setForeground(new Color(245, 245, 220));
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setLayout(null);
		panel_2.setBounds(12, 278, 420, 76);
		frame.getContentPane().add(panel_2);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(12, 13, 56, 16);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(12, 42, 56, 16);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(117, 26, 56, 16);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("%");
		label_7.setBackground(Color.DARK_GRAY);
		label_7.setBounds(184, 26, 56, 16);
		panel_2.add(label_7);
		
		JButton button = new JButton("OFF");
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(new Color(245, 245, 220));
		button.setBounds(204, 22, 56, 25);
		panel_2.add(button);
		
		JButton button_1 = new JButton("BUNK");
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setForeground(new Color(245, 245, 220));
		button_1.setBounds(269, 22, 63, 25);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("ATTEND");
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setForeground(new Color(245, 245, 220));
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_2.setBounds(340, 23, 75, 25);
		panel_2.add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setLayout(null);
		panel_3.setBounds(12, 367, 420, 76);
		frame.getContentPane().add(panel_3);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(12, 13, 56, 16);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setBounds(12, 42, 56, 16);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setBounds(117, 26, 56, 16);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("%");
		label_11.setBounds(184, 26, 56, 16);
		panel_3.add(label_11);
		
		JButton button_3 = new JButton("OFF");
		button_3.setBackground(Color.DARK_GRAY);
		button_3.setForeground(new Color(245, 245, 220));
		button_3.setBounds(204, 22, 56, 25);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("BUNK");
		button_4.setBackground(Color.DARK_GRAY);
		button_4.setForeground(new Color(245, 245, 220));
		button_4.setBounds(269, 22, 63, 25);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("ATTEND");
		button_5.setBackground(Color.DARK_GRAY);
		button_5.setForeground(new Color(245, 245, 220));
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_5.setBounds(340, 23, 75, 25);
		panel_3.add(button_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(245, 245, 220));
		panel_4.setLayout(null);
		panel_4.setBounds(12, 456, 420, 76);
		frame.getContentPane().add(panel_4);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setBounds(12, 13, 56, 16);
		panel_4.add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setBounds(12, 42, 56, 16);
		panel_4.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setBounds(117, 26, 56, 16);
		panel_4.add(label_14);
		
		JLabel label_15 = new JLabel("%");
		label_15.setBounds(184, 26, 56, 16);
		panel_4.add(label_15);
		
		JButton button_6 = new JButton("OFF");
		button_6.setBackground(Color.DARK_GRAY);
		button_6.setForeground(new Color(245, 245, 220));
		button_6.setBounds(204, 22, 56, 25);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("BUNK");
		button_7.setBackground(Color.DARK_GRAY);
		button_7.setForeground(new Color(245, 245, 220));
		button_7.setBounds(269, 22, 63, 25);
		panel_4.add(button_7);
		
		JButton button_8 = new JButton("ATTEND");
		button_8.setBackground(Color.DARK_GRAY);
		button_8.setForeground(new Color(245, 245, 220));
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_8.setBounds(340, 23, 75, 25);
		panel_4.add(button_8);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.setBackground(new Color(245, 245, 220));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(174, 556, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(49, 54, 75, 75);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SRINIVASU\\Desktop\\rsz_computer-1331579_640.png"));
		frame.getContentPane().add(lblNewLabel_3);
	}

}
