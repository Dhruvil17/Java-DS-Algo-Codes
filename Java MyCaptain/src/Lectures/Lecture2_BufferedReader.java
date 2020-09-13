package Lectures;
import java.util.*;
import java.io.*;

public class Lecture2_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		// Other way of taking input from user //
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Enter any number : ");
//		int n=Integer.parseInt(br.readLine());
//		System.out.println("Entered number is "+n);
		String str;
		System.out.println("Enter any String : ");
		str=br.readLine();
		str=str.trim();
		int spaces=0;
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				flag=1;
			}
			spaces++;
			if(ch!=' ')
			{
				flag=0;
			}
		}
		System.out.println(spaces+" spaces");
		System.out.println((spaces+1)+" Words");
		int j=0,x=0;
		while(j<str.length())
		{
			char ch1=str.charAt(j);
			if(ch1<=122 && ch1>=97)
			{
				x++;
			}
			j++;
		}
		System.out.println(x+" Small letters");	
		int c=0,z=0;
		do
		{
			char ch3=str.charAt(z);
			if(ch3>=65 && ch3<=90) {
				c++;
			}
			z++;
		}
		while(z<str.length());
		System.out.println(c+" Capital letters");
	}

	private static char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
