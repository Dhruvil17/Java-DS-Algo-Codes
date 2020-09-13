public class Methods {

	//Method Overloading
	static int maxOf(int a,int b)
	{
		return (a>b?a:b);
	}
	static float maxOf(float a,float b)
	{
		return (a>b?a:b);
	}
	public static void main(String[] args) {
		
    int firstNumber = 50;
    int secondNumber = 48;
    float a = (float)28.45;
    float b = (float)34.56;
    int result = maxOf(firstNumber, secondNumber);
    float ans = maxOf(a,b);
    System.out.println("The maximum number is "+result);
    System.out.println("The maximum number is "+ans);
    
    
	}
}
