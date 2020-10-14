package Chapt3;

public class ThreadTest3 implements Runnable{

	@Override
	public void run() 
	{	
		System.out.println("Starting Current Thread : "+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println("I love Android Development");
			try 
			{
				Thread.sleep(200);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Thread Completed : "+Thread.currentThread().getName());
	}
}
