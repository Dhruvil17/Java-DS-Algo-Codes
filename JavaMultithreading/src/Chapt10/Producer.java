package Chapt10;
import java.time.LocalDateTime;
import java.util.*;

public class Producer extends Thread {

	private static final int MAX_SIZE = 5;
	private final List<String> messages = new ArrayList<>();
	
	@Override
	public void run()
	{
		try
		{
			int x = 0;
			while(x<10) // We can also write infinite loop here
			{
				produce();
				x++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	private synchronized void produce() throws InterruptedException
	{
		while(messages.size() == MAX_SIZE)
		{
			System.out.println("Queue limit reached. Waiting for consumer !!!");
			wait();
			System.out.println("Producer got notification from consumer !");
		}
		String data = LocalDateTime.now().toString();
		messages.add(data);
		System.out.println("Producer produced data");
		notify();
	}
	public synchronized String consume() throws InterruptedException
	{
		notify();
		while(messages.isEmpty())
		{
			wait();
		}
		String data = messages.get(0);
		messages.remove(data);
		return data;
	}
}
