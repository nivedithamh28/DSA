
public class MaxofArray{
    public static int arrMax(int[] arr)
    {
       int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) throws Exception {
       int[] arr ={ 4,7,1,8,3,9};
        int result = arrMax(arr);
         System.out.println("Largest element : " + result);
        
    }
}