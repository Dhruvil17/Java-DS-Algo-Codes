package Chapt10;

public class Consumer extends Thread{

	private Producer producer;
	
	public Consumer(Producer producer)
	{
		this.producer = producer;
	}
	
	@Override
	public void run()
	{
		try
		{
			int x = 0;
			while(x<10) // We can also write infinite loop here 
			{
				String data = producer.consume();
				System.out.println("Consumed by : "+Thread.currentThread().getName()+" data : "+data);
				Thread.sleep(200);
				x++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
