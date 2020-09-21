package Dp;
import java.util.Arrays;

public class MinCoinsDP {

	public static void main(String[] args) {
		
		// Using Dynamic Programming 
		int n = 18;
		int a[] = {7,5,1};
		int dp[] = new int[n+1];
		Arrays.fill(dp,-1);
		dp[0] = 0;
		
		int ans = minCoins(n,a,dp);
		System.out.println(ans);
		
		// Printing the DP Array now 
		for(int i=0;i<dp.length;i++)
		{
			System.out.print(dp[i]+" ");
		}
	}
	
	static int minCoins(int n,int a[],int dp[])
	{
		if(n==0) return 0;
		
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int subAns = 0;
			if(n-a[i] >= 0)
			{
				if(dp[n-a[i]]!=-1)
				{
					subAns = dp[n-a[i]];
				}
				else
				{
					subAns = minCoins(n-a[i],a,dp);
				}
				if(subAns + 1 < ans && subAns!=ans)
				{
					ans = subAns + 1;
				}
			}
		}
		dp[n] = ans;
		return dp[n];
	}
}
