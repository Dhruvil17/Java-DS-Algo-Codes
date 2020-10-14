package Chapt1;

public class BasicThreads {

	public static void main(String[] args) throws InterruptedException {
		
		// A program can have multiple processes. A process can have multiple threads
		// We can only see the process and not the threads.
		
		Thread th = Thread.currentThread();
		
		System.out.println("Current Thread : "+th.getName());
		
		th.setName("MyThread");
		
		System.out.println("Current Thread : "+th.getName());
		
		Thread.sleep(10_000); // Sleeping for 10 secs 
	}
}
