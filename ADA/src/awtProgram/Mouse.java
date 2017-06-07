package awtProgram;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class program1 extends JFrame implements MouseListener
{
	Container c;
	JTextArea tx=new JTextArea();
	JTextArea tx1=new JTextArea();
	public program1() {
		// TODO Auto-generated constructor stub
		c=this.getContentPane();
		c.setLayout(null);
		c.add(tx);
		c.add(tx1);
		tx.addMouseListener(this);
		tx.setBounds(20,20,100,100);
		tx.setBackground(Color.BLACK);
		tx1.setBounds(150,20,200,200);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		tx1.append("MOUSE CLICKED!!\n");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		tx1.append("MOUSE ENTERED!!\n");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		tx1.append("MOUSE EXITED!!\n");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		tx1.append("MOUSE PRESSED!!\n");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		tx1.append("MOUSE RELEASED!!\n");
	}
}
public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program1 frame=new program1();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 500, 400);
	}

}
