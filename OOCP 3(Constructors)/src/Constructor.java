class Vehicle
{
	int wheels;
	int headLights;
	String colour;
	Vehicle(int wheels)
	{
		this.wheels = wheels; // This -> Points to your current object
		headLights = 2;
	}
	// Constructor overloading can be performed
	Vehicle(int wheels, String colour)
	{
		this.wheels = wheels;
		this.colour = colour;
	}
	Vehicle()
	{
		
	}
}

public class Constructor {

	Constructor()
	{
		System.out.println("Object is now created");
	}
	public static void main(String[] args) {
		
    Constructor obj = new Constructor(); //Written after new keyword is called every time (Understand Purpose)
    Vehicle car = new Vehicle(4);
    Vehicle activa = new Vehicle(2);
    Vehicle rickshaw = new Vehicle(3,"Yellow");
    Vehicle random = new Vehicle();
    System.out.println("Rickshaw has "+rickshaw.wheels+" wheels and colour "+ rickshaw.colour);
    // Default constructor
    // Everything zero initialized at first called if not written anything
    // No argument Constructor called 
    System.out.println(car.wheels+" wheels");
    System.out.println(activa.wheels+" wheels");
    System.out.println("The random vehicle has "+random.wheels+" wheels and "+random.headLights+" headlights");
    
	}
}
