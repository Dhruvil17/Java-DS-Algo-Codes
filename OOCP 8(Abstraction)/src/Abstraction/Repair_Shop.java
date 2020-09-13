package Abstraction;

public class Repair_Shop {

	public static void repairCar(Car car)
	{
		System.out.println("Car is repaired");
	}
	public static void main(String[] args) {
		
		// Abstraction - Reduce the program Complexity and effort - It is process of hiding certain details and showing only the essential information to the user //
		// Achieved by -> 1. Abstract Classes  2. Interfaces
		Wagon_R wagonr = new Wagon_R();
		Audi audi = new Audi();
     	repairCar(wagonr);
		repairCar(audi);
		
		// Difference of Encapsulation and Abstraction
		// 1. In Encapsulation the data is hidden due to security reasons -> Solves issue at Implementation level
		// 1. In Abstraction the data is hidden to reduce the complexity of program -> Solves issue at design level
	}
}
