package Unit1;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter no. of elements you want in array:"); 
		  int n;
	        n = sc.nextInt(); 

	        int a[] = new int[n]; 

	        System.out.println("Enter all the elements:");         

	        for(int i = 0; i < n; i++) 

	        { 

	             a[i] = sc.nextInt(); 

	        } 

	        sc.close();   

	        for(int i = 0; i < n; i++) 

	        { 

	           System.out.print(a[i] + " "); 

	        }
	        int flag=0;
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=i+1;j<n;j++)
	        	{
	        		if(a[i]==a[j])
	        		{
	        			flag=1;
	        			break;
	        		}

	        	}
	        }
	        if(flag==0)
	        {
	        	System.out.println("It is a unique array");
	        }
	        else
	        {
	        	System.out.println("It is not a unique array");
	        }
	 
	}
}
