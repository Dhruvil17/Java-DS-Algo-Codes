package Programs;

public abstract class Shape {

	public abstract void draw();
	
}
class rect extends Shape
{
	public void draw()
	{
		System.out.println("Draw a rectangle");
	}
}
class circ extends Shape
{
	public void draw()
	{
		System.out.println("Draw a circle");
	}
}
class diamond extends Shape
{
	public void draw()
	{
		System.out.println("Draw a Shape");
	}
}
