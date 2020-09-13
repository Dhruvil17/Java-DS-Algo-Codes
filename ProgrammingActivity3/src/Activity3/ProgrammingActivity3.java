package Activity3;
import java.util.*;

class Calculation
{
	protected int result;
	public void Addition(int a,int b)
	{
		result = a+b;
		System.out.println("Addition of numbers is "+result);
	}
	public void Subtraction(int c,int d)
	{
		result = c-d;
		System.out.println("Subtracton of numbers is "+result);
	}
}

public class ProgrammingActivity3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
//		Calculation calculation = new Calculation();
		MyCalculation mycalculation = new MyCalculation();
//		calculation.Addition(a,b);
//	    calculation.Subtraction(a,b);
		mycalculation.Addition(a,b);
		mycalculation.Subtraction(a,b);
	    mycalculation.Multiplication(a,b);
	    mycalculation.Division(a,b);
	    mycalculation.Modulus(a,b);
	}
}
