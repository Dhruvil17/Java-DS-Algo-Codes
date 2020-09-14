package Recursion;

public class gameTheoryCoinProblem {

	public static void main(String[] args) {
		
		int arr[] = {1, 5, 7, 13, 2, 4};
		
		int left = 0;
		int right = arr.length - 1;
		
		System.out.println(coinMax(arr, left, right));

	}
	
	static int coinMax(int a[], int l, int r)
	{
		if(l+1 == r)
		{
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l] + Math.min(coinMax(a, l+2, r), coinMax(a, l+1, r-1)), a[r] + Math.min(coinMax(a, l, r-2), coinMax(a, l+1, r-1)));
	}
}
