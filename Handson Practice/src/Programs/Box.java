package Programs;

public class Box extends Rectangle{

	private double height;
	
	public void setDimension(double l,double w,double h)
	{
		super.setDimension(l,w);
		this.height=h;
	}
	public double getHeight()
	{
		return height;
	}
	// Method Overriding //
	public double area()
	{
		return 2*(getLength()*getWidth()+getWidth()*getHeight()+getHeight()*getLength());
	}
	public void getArea()
	{
		System.out.println("Area of the box is "+area());
	}
}
