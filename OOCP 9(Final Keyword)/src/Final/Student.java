package Final;

public final class Student {

	String name;
	final int rollNo;
	{
		rollNo = 32;
	}
	public Student()
	{
		name = "Dhruvil";
	}
	public final void description()
	{
		System.out.println("Inside Parent Class");
	}
}
