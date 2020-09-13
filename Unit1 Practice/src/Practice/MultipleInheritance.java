package Practice;

interface Print
{
	void print();
}

interface Show
{
	void show();
}

public class MultipleInheritance implements Show,Print 
{
	public void print()
	{
		System.out.println("Printing");
	}
	public void show() 
	{
		System.out.println("Showing");
	}
	
	public static void main(String[] args)
	{
		MultipleInheritance m = new MultipleInheritance();
		m.print();
		m.show();
	}
}
