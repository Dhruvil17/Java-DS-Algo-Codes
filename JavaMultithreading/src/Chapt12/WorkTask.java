package Chapt12;

public class WorkTask implements Runnable {

	private long createdTime;
	private String taskName;

	public WorkTask(String taskName)
	{
		this.createdTime = System.currentTimeMillis();
		this.taskName = taskName;
	}
	
	@Override
	public void run() 
	{
		Thread currentThread = Thread.currentThread();
		long waitedTime = System.currentTimeMillis() - createdTime;
		
		System.out.println(taskName +" got CPU after waiting for "+waitedTime+"ms with thread "+currentThread.getName());
		
		try
		{
			Thread.sleep(1000);
			System.out.println(taskName+" completed. Releasing thread "+currentThread.getName());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
