package Chapt9;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringReverseThread extends Thread{

	private List<Character> names;
	private String message;
	private static Lock lock = new ReentrantLock(true); // Now they will acquire in the order specified
	
	public StringReverseThread(List<Character> names, String message)
	{
		this.names = names;
		this.message = message;
	}
	
	@Override
	public void run()
	{
		lock.lock();
		try
		{
			System.out.println("'Lock' aquired by "+Thread.currentThread().getName());
			for(int i=0;i<message.length();i++)
			{
				try
				{
					names.add(message.charAt(i));
					Thread.sleep(20);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			System.out.println(names);
		}
		finally
		{
			lock.unlock();
			System.out.println("Lock unlocked by "+Thread.currentThread().getName());
		}
	}
}
