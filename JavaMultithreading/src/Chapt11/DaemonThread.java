package Chapt11;

public class DaemonThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread th = new Thread (() -> {
			
			System.out.println("Am i Daemon : "+Thread.currentThread().isDaemon());
			while(true) 
			{
				try
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		th.setDaemon(true);
		th.start();
		
		System.out.println("Executing program Shut Down");
		Thread.sleep(200);
	}
}
