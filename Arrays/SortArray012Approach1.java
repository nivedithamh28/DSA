
import java.util.Arrays;

// Brute force approach

public class SortArray012Approach1
{
    public static void sortArray(int[] arr)
    {
        int count0 =0,count1=0,count2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else count2++;
        
        }
            int index=0;
            while(count0-- > 0) arr[index++]=0;
            while(count1-- > 0) arr[index++]=1;
            while(count2-- > 0) arr[index++]=2;   

    }

    public static void main(String[] args) {
        int[] arr = {2,1,0,1,2,0,1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }

    }
}