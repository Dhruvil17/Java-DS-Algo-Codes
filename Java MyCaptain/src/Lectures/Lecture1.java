package Lectures;

import java.util.*;
import java.io.*;

public class Lecture1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter your name : ");
		str=sc.nextLine();
		sc.close();
		if(str.equals("Dhruvil Soni"))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not matched");
		}
	}
}
