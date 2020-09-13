package Lectures;
import java.io.*;

class Sample
{
	void Sopln(Object o)
	{
		System.out.println(o);
	}
}
public class ExceptionHandling {

	static Sample s = new Sample();
	// User Defined Exception //
	public static int calc(int[] arr,int[] rem) throws Exception
	{
		for(int i=0;i<3;i++)
		{
			if(arr[i]<0||rem[i]<0)
			{
				throw new Exception("Numbers should be positive");
			}
		}
		int x=1; // Chinese Remainder Theorem //
		boolean res=false;
		while(true)
		{
			int i;
			for(i=0;i<3;i++)
			{
				if(x%arr[i]!=rem[i])
				{
					break;
				}
			}
			if(i==3)
			{
				return x;
			}
			x++;
		}
	}
	public static void main(String[] args) {
		
		// Exception occur at the run Time of the program 
		// 2 types of Exception in Java
		// 1. Inbuilt Exception -> 1. Try 2. Catch 3. Finally 4. Throw 5. Throws
		// 2. User Defined
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try // Try and Catch blocks run Simultaneously
		{
//			int x,y;
//			String str1=null;
//			String str2="This";
//			s.Sopln("Enter two numbers : ");
//			x=Integer.parseInt(br.readLine());
//			y=Integer.parseInt(br.readLine());
//			s.Sopln(str1.length()); // 2. NullPointerException
//			s.Sopln(str2.charAt(5)); // 3. StringIndexOutofBoundsException 
			int[] arr=new int[3];
			int[] rem=new int[3];
			for(int i=0;i<3;i++)
			{
				arr[i]=Integer.parseInt(br.readLine());
				rem[i]=Integer.parseInt(br.readLine());
			}
			int res=calc(arr,rem);
			s.Sopln(res);
//			for(int i=0;i<=arr.length;i++)
//			{
//				s.Sopln(arr[i]); // 4. ArrayIndexOutOfBoundsException
//			}
//			double c=x/y;
//			s.Sopln("Division of two numbers is "+c);
		}
		catch(ArithmeticException e) // 1. ArithmeticException
		{
			s.Sopln(e.getClass()+" :"+e.getMessage());
		}
		catch(IOException e)
		{
			s.Sopln(e.getClass()+" :"+e.getMessage());
		}
		catch(Exception e) // Super Class of all Exceptions 
		{
			s.Sopln(e.getClass()+" :"+e.getMessage());
		}
		finally
		{
			s.Sopln("This is Finally Block");
		}
	}
}
