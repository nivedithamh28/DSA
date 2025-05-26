public class MissingNumberInArray
{
    public static int missingNumber(int[] arr)
    {
        int n = arr.length+1;
        int expected = (n*(n+1))/2;

        int actualSum = 0;
        for(int i : arr)
        {
            actualSum = actualSum + i;
        }

        return expected - actualSum;

    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        int missing = missingNumber(arr);
        System.out.println("Missing number: " + missing);
    }
}