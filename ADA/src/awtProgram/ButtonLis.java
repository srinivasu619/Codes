package awtProgram;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class program2 extends JFrame implements ActionListener
{
	JTextField tf=new JTextField();
	JTextArea tx=new JTextArea();
	Font f;
	JButton button=new JButton();
	JButton button1=new JButton();
	JButton button2=new JButton();
	public program2() {
		// TODO Auto-generated constructor stub
		Container c=this.getContentPane();
		c.setLayout(null);
		c.add(tf);
		c.add(tx);
		c.add(button);
		c.add(button1);
		c.add(button2);
		button.setText("CLICK");
		button.setVisible(true);
		button.addActionListener(this);
		button1.setText("CLEAR");
		button1.setVisible(true);
		button1.addActionListener(this);
		button2.setText("CLEAR ALL");
		button2.setVisible(true);
		button2.addActionListener(this);
		f=new Font("Arial", Font.BOLD, 20);
		tf.setBounds(20,20,440,50);
		tx.setBounds(20,150,440,150);
		button.setBounds(100, 80, 70, 30);
		button1.setBounds(190, 80, 80, 30);
		button2.setBounds(290, 80, 100, 30);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button)
		{
			String s=tf.getText();
			tx.setFont(f);
			tx.append(s+"\n");
		}
		if(e.getSource()==button1)
		{
			tf.setText("");
		}
		if(e.getSource()==button2)
		{
			tf.setText("");
			tx.setText("");
		}
	}
}
public class ButtonLis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program2 frame=new program2();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 500, 400);
	}

}
