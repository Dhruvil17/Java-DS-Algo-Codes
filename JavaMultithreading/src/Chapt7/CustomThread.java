package Chapt7;

public class CustomThread extends Thread {

	private boolean shouldExit = false;
	
	public void setShouldExit(boolean shouldExit)
	{
		this.shouldExit = shouldExit;
	}
	
	@Override
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				if(shouldExit)
				{
					break;
				}
				System.out.println("Thread is running");
				Thread.sleep(20);
			}
			System.out.println("Thread is completed");
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
		}
	}

}