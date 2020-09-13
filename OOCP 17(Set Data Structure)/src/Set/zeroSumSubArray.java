package Set;
import java.util.*;

public class zeroSumSubArray {

	public static void main(String[] args) {
		
		// Find the subArray with sum Zero or with any value given initially in a Array using Linear Time Complexity
		int arr[] = {2,1,3,4,-2};
		int n = arr.length;
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		int k = 7;
		boolean found = false;
		for(int i=0;i<n;i++)
		{
			set.add(sum);
			sum = sum + arr[i];
			System.out.print(sum+" ");
			if(set.contains(sum-k)) // sum (for Zero sum subArray)
			{
				found = true;
			}
		}
		System.out.println();
		if(found)
		{
			System.out.println("Solution found");
		}
		else
		{
			System.out.println("Solution not found");
		}
	}
}