package awtProgram;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Border {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame();
		JLabel label1=new JLabel("THIS");
		JLabel label2=new JLabel("IS");
		JLabel label3=new JLabel("A");
		JLabel label4=new JLabel("BORDER");
		JLabel label5=new JLabel("LAYOUT");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(300,200,500,300);
		BorderLayout bl=new BorderLayout();
		Container c=jf.getContentPane();
		c.setLayout(bl);
		javax.swing.border.Border border=BorderFactory.createLineBorder(Color.BLACK, 2);
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
		c.add(label1,BorderLayout.PAGE_START);
		c.add(label2,BorderLayout.LINE_START);
		c.add(label3,BorderLayout.CENTER);
		c.add(label4,BorderLayout.LINE_END);
		c.add(label5,BorderLayout.PAGE_END);
	}

}
