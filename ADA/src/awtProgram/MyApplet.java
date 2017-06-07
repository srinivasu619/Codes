package awtProgram;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
/*<applet code="MyApplet" width="300" height="200"></applet>*/
import java.awt.event.ActionListener;
public class MyApplet extends Applet implements ActionListener{
	Label l1,l2,l3;
	TextField tf1,tf2;
	Button b1;
	public void init()
	{
		l1=new Label("First Number");
		l2=new Label("Second Number");
		l3=new Label();
		tf1=new TextField();
		tf2=new TextField();
		b1=new Button("Add");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		tf1.setBounds(150,50,100,20);
		tf2.setBounds(150,100,100,20);
		b1.setBounds(100,150,80,20);
		l3.setBounds(30,180,100,20);
		add(l1);
		add(l2);
		add(tf1);
		add(tf2);
		add(b1);
		add(l3);
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		l3.setText("SUM IS: "+ (Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())));
		
	}
}
