package awtProgram;

import java.applet.Applet;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/*<applet code="MyApplet" width="300" height="200"></applet>*/
public class MyApplet1 extends Applet implements KeyListener{
	TextArea tx=new TextArea();
	TextField tf=new TextField();
	public void init()
	{
		setLayout(null);
		add(tf);
		add(tx);
		tf.addKeyListener(this);
		tf.setBounds(50, 50,150,40);
		tx.setBounds(210,50,250,250);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		tx.append("keyPressed: "+e.getKeyChar()+"\n");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		tx.append("keyReleased: "+e.getKeyChar()+"\n");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		tx.append("keyTyped: "+e.getKeyChar()+"\n");
	}
	
}
