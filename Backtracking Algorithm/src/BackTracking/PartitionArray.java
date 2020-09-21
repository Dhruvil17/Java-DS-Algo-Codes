package BackTracking;
import java.util.*;

public class PartitionArray {

	public static void main(String[] args) 
	{
		int arr[] = {2, 1, 2, 3, 4, 8};
		int sum = 0;
		
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		boolean isPossible = ((sum%2==0) && (partition(arr, 0, ans, sum/2)));
		
		if(isPossible)
		{
			int size = ans.size();
			for(int i=0;i<size;i++)
			{
				System.out.println(ans.get(i));
			}
		}
		else
		{
			System.out.println("No partition possible");
		}
	}
	static boolean partition(int a[], int i, ArrayList<Integer> ans, int sum)
	{
		int n = a.length;
		if(i >= n || sum < 0) return false;
		if(sum==0) return true;
		
		ans.add(a[i]);
		boolean leftPossible = partition(a, i+1, ans, sum-a[i]);
		
		if(leftPossible) return true;
		
		// This line makes BackTracking possible
		ans.remove(ans.size()-1); 
		
		return partition(a, i+1, ans, sum);
	}
}
