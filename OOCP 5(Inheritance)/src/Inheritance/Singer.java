package Inheritance;

public class Singer extends Person{

	public Singer(String name) {
		super(name);
		System.out.println("Inside Singer Constructor");
	}
	public void sing()
	{
		System.out.println(name+" is singing");
	}
	public void laugh()
	{
		System.out.println("Singer "+name+ " is laughing");
	}
}
