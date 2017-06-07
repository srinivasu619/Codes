package awtProgram;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

class program extends JFrame implements KeyListener
{
	Container c;
	TextArea tx=new TextArea();
	TextField tf=new TextField();
	public program() {
		// TODO Auto-generated constructor stub
		c=this.getContentPane();
		c.setLayout(null);
		c.add(tf);
		c.add(tx);
		tf.addKeyListener(this);
		tf.setBounds(50, 50,150,40);
		tx.setBounds(210,50,250,250);
			
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		tx.append("keyPressed: "+e.getKeyChar()+"\n");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		tx.append("keyReleased: "+e.getKeyChar()+"\n");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		tx.append("keyTyped: "+e.getKeyChar()+"\n");
	}
}
public class Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program frame=new program();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 500, 400);
		
	}

}
