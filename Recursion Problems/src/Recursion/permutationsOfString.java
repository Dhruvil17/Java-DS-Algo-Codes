package Recursion;
import java.util.*;

public class permutationsOfString {

	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		
		String s = "abc";
		int l = 0;
		int r = s.length() - 1;
		permutations(s, l, r);

	}
	static void permutations(String s, int l, int r)
	{
		if(l==r)
		{
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s = interchange(s, l, i);
			permutations(s, l+1, r);
			s = interchange(s, l, i);
		}
	}
	static String interchange(String s, int a, int b)
	{
		char arr[] = s.toCharArray();
		char temp = arr[a];
		arr[a]= arr[b];
		arr[b] = temp;
		return new String(arr);
	}
}
