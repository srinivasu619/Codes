package awtProgram;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
/*<applet code="MyApplet4" width="300" height="200"></applet>*/
public class MyApplet4 extends Applet{
	Label l1,l2,l3,l4,l5;
	public void init()
	{
		l1=new Label("THIS");
		l2=new Label("IS");
		l3=new Label("A");
		l4=new Label("GRID");
		l5=new Label("LAYOUT");
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.CENTER);
		l3.setAlignment(Label.CENTER);
		l4.setAlignment(Label.CENTER);
		l5.setAlignment(Label.CENTER);
		setLayout(new GridLayout(2,2));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
	}
}
