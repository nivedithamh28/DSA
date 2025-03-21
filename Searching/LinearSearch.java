import java.util.Scanner;

public class LinearSearch {

	static void Search(int[] arr,int key)
	{
		boolean found = false;
		for(int ele : arr)
		{
			if(ele == key)
			{
				System.out.println("Element " +key + " found " );
				found = true;
				break;
			}
			
		}
		if(!found)
		{
			System.out.println("elemnt not found");
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("Enter the array elements:");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();	
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println("Enter the key ");
		int key = s.nextInt();
		Search(arr,key);

	}

}
