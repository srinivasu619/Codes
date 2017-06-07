package awtProgram;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Grid{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame();
		JLabel label1=new JLabel("THIS");
		JLabel label2=new JLabel("IS");
		JLabel label3=new JLabel("A");
		JLabel label4=new JLabel("GRID");
		JLabel label5=new JLabel("LAYOUT");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(300,200,500,300);
		jf.setTitle("GRID LAYOUT");
		GridLayout gl=new GridLayout();
		Container c=jf.getContentPane();
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		label1.setBorder(border);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label2.setBorder(border);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label3.setBorder(border);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label4.setBorder(border);
		label4.setHorizontalAlignment(JLabel.CENTER);
		label5.setBorder(border);
		label5.setHorizontalAlignment(JLabel.CENTER);
		c.setLayout(gl);
		c.add(label1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		c.add(label5);
	}

}
