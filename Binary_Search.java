
public class Binary_Search 
{
	public static int BinarySearch(int[]arr,int target)
	{
		int left=0;
		int right=arr.length-1;
		
		while(left<=right)
		{
			int mid = left+((right-left)/2);
			if(arr[mid]==target)
			{
				return mid;
			}
			if(arr[mid]>target)
			{
				right=mid+1;
			}
			
			if(arr[mid]<target)
			{
				left=mid-1;
			}
				
		}
		
		return -1;
	}
	

	public static void main(String[] args)
	{
		int[] arr = {45,22,78,65,12,55,98};
		int target=22;
		int result=BinarySearch(arr, target);
		if(result!=-1)
		{
			System.out.println("element found " + result);
		}
		else
		{
			System.out.println("element not found " );
		}
	}

}
