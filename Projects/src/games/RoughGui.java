package games;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RoughGui extends JPanel implements Runnable{
	private Color Red=new Color(255, 51, 0);
	private Color Green=new Color(0, 255, 0);
	private Color Yellow=new Color(255, 255, 0);
	private Color Blue=new Color(0,0,255);
	private Color default_Red=new Color(255, 173, 153);
	private Color default_Green=new Color(153, 255, 153);
	private Color default_Yellow=new Color(255, 255, 179);
	private Color default_Blue=new Color(102, 140, 255);
	public Color c1=default_Red,c2=default_Green,c3=default_Yellow,c4=default_Blue;
	public void setDefault()
	{
		c1=default_Red;
		c2=default_Green;
		c3=default_Yellow;
		c4=default_Blue;
	}
	public void setColor(int number)
	{
		switch(number)
		{
			case 1:c1=Red;
					break;
			case 2:c2=Green;
					break;
			case 3:c3=Yellow;
					break;
			case 4:c4=Blue;
					break;
		}
	}
	public void paint(Graphics g) {
		g.setColor(c1);
		g.fillArc(325,220,150,150, 0, 90);//1st
		g.setColor(c2);
		g.fillArc(320,220,150,150, 180,-90);//2nd
		g.setColor(c3);
		g.fillArc(320,225,150,150, 180, 90);//3rd
		g.setColor(c4);
	    g.fillArc(325,225,150,150,0,-90);//4th
	   }
	@Override
	public void run() {
		try 
		{
			for(int i=0;i<10;i++)
			{
				System.out.print("ROUND: "+(i+1)+"    ");
				for(int j=0;j<=i;j++)
				{
					int random=(int)(Math.random() * 4)+1;
					System.out.print(random+" ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					setColor(random);
					repaint();
					Thread.sleep(500);
					setDefault();
					repaint();
				}
				System.out.println();
				setDefault();
				repaint();
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("ROUGH GUI");
		JButton button=new JButton("CLICK");
		RoughGui gui=new RoughGui();
		ButtonPanel but=new ButtonPanel();
		but.setBounds(0,150,199,300);
		gui.setBounds(200,150,400,400);
		button.setBounds(10, 50, 100, 30);
		frame.add(gui);
		frame.add(button);
		frame.add(but);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Thread t=new Thread(gui);
		t.start();
	}

}
