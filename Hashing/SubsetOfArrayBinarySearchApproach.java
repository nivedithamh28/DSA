
import java.util.Arrays;

public class SubsetOfArrayBinarySearchApproach {

    public static boolean binarySearch(int[] arr, int target)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid =(low+high) /2;
            if(arr[mid]==target)
                return true;
            else if(arr[mid] < target)
                low=mid+1;
            else
                high = mid -1;
        }
        return false;
    }

    public static boolean isSubSet(int[] arr1, int[] arr2 )
    {
        Arrays.sort(arr1);
        for(int num: arr2)
        {
            if(!binarySearch(arr1, num))
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        System.out.println(isSubSet( arr1, arr2));
    }

}