import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter no. of elements you want in array:");
		num=sc.nextInt();
		int a[] = new int[num];
		System.out.println("Enter all the elements : ");
		for(int i = 0; i < num; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("Elements of array are : ");
		for(int i = 0; i < num; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int loss=0,profit=0;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i+1;j<a.length;j++)
	        {
	            if(a[i]-a[j]>loss)
	            	loss=a[i]-a[j];
	            if((a[j]-a[i])>profit)
	                profit=a[j]-a[i];
	            } 	
	        }
	    if(loss!=0 && profit!=0)
	    System.out.println("Profit : "+profit+" Loss : "+loss);
	    else if(loss!=0)
	    System.out.println("loss : "+loss);
	    else if(profit!=0)
	    System.out.println("Profit : "+profit);
	    else
	    System.out.println("Nothing is possible");
	}
}
