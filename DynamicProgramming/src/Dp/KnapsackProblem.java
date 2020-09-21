package Dp;

public class KnapsackProblem {

	public static void main(String[] args) {
		
		int w = 10; // Weight of our Bag
		int n = 4; // Total weights available
		int wt[] = {1,3,4,6}; // Array of weights available
		int val[] = {20,30,10,50}; // Value of each weight respectively
	
		int mat[][] = new int[n+1][w+1];
		
		for(int i=0;i<=n;i++)
		{
			mat[i][0] = 0;
		}
		for(int j=0;j<=w;j++)
		{
			mat[0][j]=0;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				int maxValWithoutCurr = mat[i-1][j];
				int maxValWithCurr = 0;
				
				int weight = wt[i-1];
				if(j>=weight)
				{
					maxValWithCurr = val[i-1];
					
					int remainingCapacity = j-weight;
					maxValWithCurr += mat[i-1][remainingCapacity];
				}
				mat[i][j] = Math.max(maxValWithoutCurr,maxValWithCurr);
			}
		}
		System.out.println(mat[n][w]);
		System.out.println("Checking the Matrix filled :");
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=w;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}

