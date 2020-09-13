package Programs;

public class Rectangle {

	private double length;
	private double width;
	
	public void setDimension(double l,double w)
	{
		this.length=l;
		this.width=w;
	}
	public void getDimension()
	{
		System.out.println("Length of Rectangle is "+length);
		System.out.println("Width of Rectange is "+width);
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double area()
	{
		return getLength()*getWidth();
	}
	public void getArea()
	{
		System.out.println("Area of the Rectangle is "+area());
	}
}
