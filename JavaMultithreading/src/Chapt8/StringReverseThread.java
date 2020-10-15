package Chapt8;
import java.util.*;

public class StringReverseThread extends Thread{

	private List<Character> names;
	private String message;
	
	public StringReverseThread(List<Character> names, String message)
	{
		this.names = names;
		this.message = message;
	}
	
	@Override
	public void run()
	{
		synchronized(names)
		{
			System.out.println("'Names' aquired by "+Thread.currentThread().getName());
			for(int i=0;i<message.length();i++)
			{
				try
				{
					names.add(message.charAt(i));
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			System.out.println(names);
		}
	}
}
