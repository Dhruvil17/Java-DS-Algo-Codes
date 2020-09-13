package MathematicalQuestions;

public class ModuloArithmetic {

	public static void main(String[] args) {
	
		System.out.println(fastPower(3978432,5,1000000007));

	}
	
	static long fastPower(long a,long b,int mod)
	{
		long res = 1;
		while(b>0)
		{
			if((b&1)!=0)
			{
				res = (res * (a % mod)) % mod;
			}
			a = ((a % mod) * (a % mod)) % mod;
			b = b/2;
		}
		return res;
	}
}
