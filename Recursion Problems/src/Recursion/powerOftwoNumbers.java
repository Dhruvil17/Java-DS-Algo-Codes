package Recursion;

public class powerOftwoNumbers {
	
	static int stepsCount1;
	static int stepsCount2;

	public static void main(String[] args) {
		
		System.out.println(pow(3,20));
		System.out.println(stepsCount1); // Steps Count is calculated on basis of b -> O(N)
		System.out.println(fastPow(3,20));
		System.out.println(stepsCount2); // O(log(n)) Complexity 
	}
	
	static int pow(int a,int b)
	{
		stepsCount1++;
		if(b==0) return 1;
		
		return (a * (pow(a,b-1)));
	}
	
	static int fastPow(int a,int b)
	{
		stepsCount2++;
		if(b==0) return 1;
		
		if(b%2==0)
		{
			return fastPow(a*a,b/2);
		}
		return a*fastPow(a,b-1);
	}
}
