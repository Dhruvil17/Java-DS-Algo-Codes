package Inheritance;

public class Person {

	protected String name;
	public Person(String name)
	{
		this.name = name;
		System.out.println("Inside Person Constructor");
	}
	public void walk()
	{
		System.out.println(name+" is walking");
	}
	public void eat()
	{
		System.out.println(name+ " is eating");
	}
	public void laugh()
	{
		System.out.println("Person "+name+ " is laughing");
	}
}
