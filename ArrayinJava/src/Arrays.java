import java.util.Scanner;

public class Arrays {

		public static void main(String[] args) {
		   
			Scanner sc=new Scanner(System.in);
			int total=0,num;
			System.out.println("Enter the number of elements in array :");
			num=sc.nextInt();
			int arr[]=new int[num];
			System.out.print("Elements of elements of array : ");
			for(int i=0;i<num;i++)
			{
				arr[i]=sc.nextInt();
			}
			int max=arr[0];
			System.out.print("Elements of array are : ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i] +" ");
			}
			for(int i=0;i<arr.length;i++)
			{
				total+=arr[i];
			}
			System.out.println();
			System.out.println("Sum of elements of array is : "+total);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			System.out.println("Maximum element in array is : "+max);
	}
}
