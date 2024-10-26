
public class BubbleSort {
	
	public static void bubbleSort(int[]arr)
	{
		int n=arr.length;
		boolean swapped;
		
		for(int i=0;i<n-1;i++)
		{
			swapped = false;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
				}
			}
			if(!swapped)
			{
				break;
			}
		}
		
	}
	
	public static void main(String[]args)
	{
		int[] arr= {55,43,67,33,68,12};
		bubbleSort(arr);
		
		for(int ele:arr)
		{
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}
