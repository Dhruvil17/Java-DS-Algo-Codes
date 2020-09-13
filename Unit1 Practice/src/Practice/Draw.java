package Practice;

public interface Draw 
{
	void draw();
	default void message()
	{
		System.out.println("Default Method");
	}
}

class Rectangle implements Draw
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

interface Drawable
{
	void draw();
    static int cube(int x)
	{
		return x*x*x;
	}
}

class Recta implements Drawable
{
	public void draw() 
	{
		System.out.println("Drwaing Rectangle");
	}
}
