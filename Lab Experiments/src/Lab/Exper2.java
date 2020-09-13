package Lab;
import java.util.*;

public class Exper2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String name; // Reverse a String given by user 
		System.out.print("Enter the string : ");
		name = sc.nextLine();
		sc.close();
		//char arr[] = name.toCharArray();
		int n = name.length();
		System.out.print("Reversed string is : ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
			// System.out.println(arr[i]);
		}
	}
}
