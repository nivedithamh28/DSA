class RemoveEvenIntegers
{
    public  static int[] oddIntegerArray (int[] arr)
    {
        int oddCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 != 0)
            {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {

        int[] arr = {2,3,9,5,6,8,7};
        printArray(arr);
        int[] result = oddIntegerArray(arr);
        //printArray(result);
        System.out.println(result);
        
       

    }
}
