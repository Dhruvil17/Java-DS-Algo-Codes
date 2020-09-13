import java.util.*;
import java.math.*;

public class FibonacciLargeSeries {

	static BigInteger fib(int n)
	{
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		System.out.println("Fibonacci(0) = 0");
		System.out.println("Fibonacci(1) = 1");
		for(int i=2;i<=n;i++)
		{
			c = a.add(b); // c = a+b
			System.out.println("Fibonacci("+i+")"+" = "+c);
			a = b; // a = b
			b = c; // b = (a+b)
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the value of num : ");
        num = sc.nextInt();
        sc.close(); 
        fib(num);
	}
}
