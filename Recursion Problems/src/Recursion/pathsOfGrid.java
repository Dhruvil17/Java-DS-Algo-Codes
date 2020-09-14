package Recursion;

public class pathsOfGrid {

	public static void main(String[] args) {
		
		System.out.println(pathsOfGrid(4,4));

	}
	
	static int pathsOfGrid(int n,int m)
	{
		if(n==1 || m==1) return 1;
		
		return pathsOfGrid(n,m-1) + pathsOfGrid(m,n-1);
	}
}
