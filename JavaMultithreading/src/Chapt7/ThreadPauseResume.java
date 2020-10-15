package Chapt7;

public class ThreadPauseResume {
	
	public static void main(String[] args) throws InterruptedException
	{
		// Thread/join() will killa thread if not executed within given time
		// Thus we should close a thread properly instead of killing it in premature way
		
		CustomThread thread1 = new CustomThread();
		thread1.start();
		
		int maxSleep = 3000; // 3 seconds
		int slept = 0;
		
		while(slept < maxSleep)
		{
			Thread.sleep(300);
			slept += 300;
			if(!thread1.isAlive())
			{
				System.out.println("Thread was completed within 3 seconds");
				System.exit(0);
			}
		}
		
		if(thread1.isAlive())
		{
			thread1.setShouldExit(true);
			thread1.join();
		}
	}
}
