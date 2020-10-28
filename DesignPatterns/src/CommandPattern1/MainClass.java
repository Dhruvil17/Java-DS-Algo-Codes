package CommandPattern1;
import ConcreteCommand.LightOffCommand;
import ConcreteCommand.LightOnCommand;

public class MainClass {

	public static void main(String[] args) {
		
		RemoteControl control = new RemoteControl();
		
		Light light = new Light();
		
		Command lightsOn = new LightOnCommand(light);
	
		Command lightsOff = new LightOffCommand(light);
		
		// Switch on Command
		control.setCommand(lightsOn);
		control.pressButton();
		
		// Switch off command
		control.setCommand(lightsOff);
		control.pressButton();

	}
}
