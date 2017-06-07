package javaProgram;

class childThread1 extends Thread
{
	public childThread1() {
		super("DEMO THREAD");
		System.out.println("CHILD THREAD: "+this);
		start();
	}
	public void run()
	{
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupt.");
		}
		System.out.println("Exiting child thread.");
	}
}
public class UsingClass {
	public static void main(String args[])
	{
		new childThread1();
		for(int i=5;i>0;i--)
		{
			System.out.println("Main THREAD: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("INTERRUPT");
			}
		}
		System.out.println("EXITED FROM THE MAIN");
	}

}
