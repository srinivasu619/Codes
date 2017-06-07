package awtProgram;

import java.applet.Applet;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/*<applet code="MyApplet2" width="300" height="200"></applet>*/
public class MyApplet2 extends Applet implements MouseListener{
	TextArea tx,tx1;
	public void init()
	{
		setLayout(null);
		tx=new TextArea();
		tx1=new TextArea();
		add(tx);
		add(tx1);
		tx.addMouseListener(this);
		tx.setBounds(20,20,100,100);
		tx.setBackground(Color.BLACK);
		tx1.setBounds(150,20,200,200);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		tx1.append("MOUSE CLICKED!!\n");
		}
	@Override
	public void mouseEntered(MouseEvent e) {
		tx1.append("MOUSE ENTERED!!\n");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		tx1.append("MOUSE EXITED!!\n");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		tx1.append("MOUSE PRESSED!!\n");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		tx1.append("MOUSE RELEASED!!\n");
	}


}
