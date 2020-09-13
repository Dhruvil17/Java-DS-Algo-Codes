package Inheritance;

public class Teacher extends Person{

	public Teacher(String name)
	{
		super(name);
		System.out.println("Inside Teacher Constructor");
	}
	public void teach()
	{
		System.out.println(name+" is teaching");
	}
	// Method Overriding //
	public void laugh()
	{
		super.laugh();
		System.out.println("Teacher "+name+ " is laughing");
	}
}
