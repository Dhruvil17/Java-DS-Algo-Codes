package Activity3;

class MyCalculation extends Calculation // Inheritance -> Can access all attributes and methods of Parent Class //
{
    public void Multiplication(int x,int y)
	{
		result = x*y;
		System.out.println("Multiplication of numbers is "+result);
	}
	public void Division(int c,int d)
	{
		result = c/d;
		System.out.println("Divison of numbers is "+result);
	}
	public void Modulus(int a,int b)
	{
		result = a%b;
		System.out.println("Modulus of numbers is "+result);
	}
}
