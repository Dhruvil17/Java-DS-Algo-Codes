package Recursion;

public class sumOfNNumbers {

	public static void main(String[] args) {
		
		int n = 10;
		for(int i=1;i<n;i++)
		{
			System.out.print(sum(i)+" ");
		}
	}
	
	static int sum(int n)
	{
		if(n==1) return 1;
		
		return (n + sum(n-1));
	}
}
