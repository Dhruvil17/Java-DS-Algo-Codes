package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		fun1();
	}
	static void fun1()
	{
		int a,b;
		a=5;
		b=3;
		int c=a/b;
		System.out.println(c);
//		try
//		{
//			fun2();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getClass()+" :"+e.getMessage());
//		}
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("After delay");
	}
	static void fun2() throws ArrayIndexOutOfBoundsException
	{
		boolean isDanger=true;
		if(isDanger)
		{
			throw new ArrayIndexOutOfBoundsException(" danger is coming");
		}
	}
}