package awtProgram;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*<applet code="MyApplet3" width="300" height="200"></applet>*/
public class MyApplet3 extends Applet implements  ActionListener{
	TextField tf;
	TextArea tx;
	Button b1,b2,b3;
	Font f;
	public void init()
	{
		setLayout(null);
		tf=new TextField();
		tx=new TextArea();
		b1=new Button("CLICK");
		b2=new Button("CLEAR");
		b3=new Button("CLEAR ALL");
		add(tx);
		add(tf);
		add(b1);
		add(b2);
		add(b3);
		f=new Font("Arial", Font.BOLD, 20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf.setBounds(20,20,440,50);
		tx.setBounds(20,150,440,150);
		b1.setBounds(100, 80, 70, 30);
		b2.setBounds(190, 80, 80, 30);
		b3.setBounds(290, 80, 100, 30);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String s=tf.getText();
			tx.setFont(f);
			tx.append(s+"\n");
		}
		if(e.getSource()==b2)
		{
			tf.setText("");
		}
		if(e.getSource()==b3)
		{
			tf.setText("");
			tx.setText("");
		}
	}
	
}
