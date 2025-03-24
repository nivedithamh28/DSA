
public class SelectionSort 
{
	public static void selection(int[] arr)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[smallest])
				{
					smallest=j;
				}
			}
			
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {33,24,98,45,68,15};
		selection(arr);
		
		for(int ele:arr)
		{
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	
	
}


