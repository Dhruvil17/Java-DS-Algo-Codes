package ConcreteCommand;
import CommandPattern1.Command;
import CommandPattern1.Light;

public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void execute1() 
	{
		light.switchOn();
	}
}
