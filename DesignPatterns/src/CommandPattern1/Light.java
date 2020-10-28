package CommandPattern1;

public class Light { // Receiver Class

	private boolean on;
	
	public void switchOn()
	{
		on = true;
		System.out.println("Light is on now !!!");
	}
	public void switchOff()
	{
		on = false;
		System.out.println("Light is off now !!!");
	}
}
