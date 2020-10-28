package CommandPattern1;

public class RemoteControl { // Invoker Class

	private Command command;
	
	public void setCommand(Command command)
	{
		this.command = command;
	}
	public void pressButton()
	{
		command.execute1();
	}
}
