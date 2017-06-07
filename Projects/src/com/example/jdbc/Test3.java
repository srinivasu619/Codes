package com.example.jdbc;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Test3 {

	private JFrame frame;
	private LoginPanel loginPanel;
	private RegisterPanel registerPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 window = new Test3();
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
	public Test3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 452,683 );
		frame.setTitle("SRINIVASU");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginPanel=new LoginPanel(frame);
		loginPanel.setBounds(0, 0,  446, 648);
		frame.getContentPane().setLayout(null);
		//card=new CardLayout();
		//frame.getContentPane().setLayout(card);
		frame.getContentPane().add(loginPanel);
		loginPanel.setVisible(true);
	}	
	public void next()
	{
		registerPanel=new RegisterPanel(frame);
		loginPanel.setVisible(false);
		frame.getContentPane().add(registerPanel);
		registerPanel.setBounds(0, 0,  446, 648);
		registerPanel.setVisible(true);
	}
}
