package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {7,8,4,9,1,2,2,4};
		int n = a.length;
		int ans = 0;
		for(int i=0;i<n;i++)
		{
			int minInd = i;
			for(int j=i;j<n;j++)
			{
				if(a[minInd] > a[j])
				{
					minInd = j;
				}
				else if(a[minInd]==a[j]) // Efficient Selection Sort Algorithm//
				{
					continue;
				}
			}
			if(minInd!=i)
			{
				int temp = a[i];
				a[i] = a[minInd];
				a[minInd] = temp;
				ans++;
			}
		}
		for(int item: a)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		System.out.println(ans);
	}
}
