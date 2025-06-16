public class SubsetOfArrayBruteForceApproach
{
    public static boolean isSubSet(int[] arr1, int[] arr2)
    {
        for(int i= 0;i<arr2.length;i++)
        {
            boolean found = false;
            for(int j=0;j<arr1.length;j++ )
            {
                if(arr2[i]==arr1[j])
                {
                    found=true;
                    break;
                }
            }

            if(!found)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        System.out.println(isSubSet(arr1, arr2) ? "Yes" : "No");   
     }
}