package Lab;
import java.util.Scanner;

public class Exper1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// If else conditions 
     	int num1;
		System.out.print("Enter any number : ");
		num1 = sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("You are in if block");
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("You are in else block");
			System.out.println("Number is odd");
		}
		
		// For loop 
		System.out.print("Enter the number of elements of array : ");
		int n, sum=0;
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("Sum of elements of array is "+sum);
		
		// While loop
		int counter = 1;
		System.out.println("While loop :");
		while(counter<10)
		{
			System.out.print(counter+" ");
			counter++;
		}
		
		// Switch Statement	and do while loop
		System.out.println();
		System.out.println("Switch Statement and Do while loop :");
		int choice, select;
		do {
			System.out.println("Addition : ");
			System.out.println("Subtraction : ");
			System.out.println("Multiplication : ");
			System.out.println("Division");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			int num3, num4;
			int ans = 0;
			System.out.println("Enter two numbers : ");
			num3 = sc.nextInt();
			num4 = sc.nextInt();
			switch(choice)
			{
				case 1: 
					ans = num3 + num4;
					break;
				case 2:
					ans = num3 - num4;
					break;
				case 3:
					ans = num3 * num4;
					break;
				case 4:
					ans = num3 / num4;
					break;
				default:
					System.out.println("Invalid Operation");	
			}
			System.out.println("Final answer is "+ans);
			System.out.println("Do you want to continue ? (1 to continue and 0 to quit) :");
			select = sc.nextInt();
		}
		while(select!=0);
		
		sc.close();
		// Continue and break statements
		System.out.println("Break Statement");
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Continue Statement");
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
