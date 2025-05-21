public class RemoveDuplicates
{
    public static int removeDuplicates(int[] arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[j]!=arr[i])
            {
                arr[++j] = arr[i];
            }
            
            
            
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,1,2,2,2};
        int count = removeDuplicates(arr);
        System.out.println("Distinct elements: " + count);
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}