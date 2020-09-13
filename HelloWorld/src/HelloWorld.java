import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter your name :");
		str=sc.nextLine();
		sc.close();
		System.out.println("Your name is :" +str);
	}
}
