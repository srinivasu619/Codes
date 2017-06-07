package games;

class controller extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<=i;j++)
			{
				int random=(int)(Math.random() * 4)+1;
				System.out.print(random+" ");
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
}
public class SimonGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	controller con=new controller();
	con.start();
	}

}
