package ProjCaptain;

public class Shape {
	
	private String name="Rectangle";
	private int a=0,b=0;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSize(int A,int B)
	{
		a=A;
		b=B;
	}
	public void setSize(int r)
	{
		a=r;
	}
	public double getArea() // Polymorphism
	{
		double area=Math.PI*a*a;
		return area;
	}
	public double getArea(int b) // Polymorphism
	{
		double area=a*this.b;
		return area;
	}
	
}
