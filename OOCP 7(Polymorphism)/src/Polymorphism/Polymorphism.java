package Polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		
		// Polymorphism -> More than one form //
		// 1. Compile time 
		// 2. Run time
		
		// Animal -> Pet -> Dog
		// 2. Run time Polymorphism -> Overriding
		Dog d = new Dog();
		Pet p = d;
		Animal a = d; // Dog is a Animal // 
		d.walk();
		p.walk();
		System.out.println(d.name);
		System.out.println(p.name);
		
		// Variables can never be overrided. They are always hided from others //
		
		Greeting();
		Greeting("Dhruvil");
		Greeting("Dhruvil Soni",5);
	}
	// 1. Compile time Polymorphism -> Method Overloading //
	public static void Greeting()
	{
		System.out.println("Hello!");
	}
	public static void Greeting(String s)
	{
		System.out.println(s);
	}
	public static void Greeting(String s,int count)
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(s);
		}
	}
}
