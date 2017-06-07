package games;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	JButton button_RED,button_GREEN,button_YELLOW,button_BLUE;
	public ButtonPanel() {
		button_RED=new JButton("RED");
		button_RED.setBounds(50,75,60,20);
		button_GREEN=new JButton("GREEN");
		button_GREEN.setBounds(50,110,60,20);
		button_YELLOW=new JButton("YELLOW");
		button_YELLOW.setBounds(50,135,60,20);
		button_BLUE=new JButton("BLUE");
		button_BLUE.setBounds(50,170,60,20);
	}
}
