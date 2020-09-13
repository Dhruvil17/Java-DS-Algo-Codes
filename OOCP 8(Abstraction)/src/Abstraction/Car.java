package Abstraction;

public abstract class Car {

	public abstract void accelerate(); // Implementation of Abstraction
	
	public abstract void breaking(); // Can not instantiated 
	
	public void honk()
	{
		System.out.println("Car is honking");
	}
}
