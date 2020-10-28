package ConcreteCommand;
import CommandPattern1.Command;
import CommandPattern1.Light;

public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void execute1() 
	{
		light.switchOff();
	}
}
