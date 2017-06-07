package javaProgram;

class childThread implements Runnable
{
	Thread t;
	public childThread() {
		t=new Thread(this, "DEMO THREAD");
		System.out.println("CHILD THREAD: "+t);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5;i>0;i--)
		{
			System.out.println("CHILD THREAD: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("INTERRUPT");
			}
		}
		System.out.println("EXITED FROM THE CHILD");
	}
	
}
public class RunInterface {

	public static void main(String[] args) {

		new childThread();
		for(int i=5;i>0;i--)
		{
			System.out.println("Main THREAD: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("INTERRUPT");
			}
		}
		System.out.println("EXITED FROM THE MAIN");
}
}