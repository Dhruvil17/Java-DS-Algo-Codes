package Chapt11;

public class NonDaemonThreadProblem {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread (() -> {
			
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
		}).start();
		
		System.out.println("Executing program Shut Down");

		System.exit(0); // To terminate the running JVM in the background
	}
}
