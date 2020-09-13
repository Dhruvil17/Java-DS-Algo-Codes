package MathematicalQuestions;

public class GCDNumbers {

	public static void main(String[] args) {
		
		int a = gcd(72,18);
		System.out.println(a);
	}

	static int gcd(int a,int b)
	{
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
