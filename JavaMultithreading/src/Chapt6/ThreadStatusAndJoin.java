package Chapt6;
import Chapt5.CalculatorRunnable;

public class ThreadStatusAndJoin {

	public static void main(String[] args) throws InterruptedException {
		
		CalculatorRunnable runnable = new CalculatorRunnable(900000000L);
		
		Thread thread = new Thread(runnable);
		thread.setName("High Priority");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		
//		while(thread.isAlive())
//		{
//			System.out.println("Thread is active");
//			Thread.sleep(50);
//		}
//		System.out.println("Thread is completed");
		
		thread.join(); // Main thread waits for our thread to complete its execution by doing this
		
		thread.join(5_000); // Main thread will wait for 5secs to complete our thread or else it will kill that particular thread
		
		System.exit(0);
		
	}
}
