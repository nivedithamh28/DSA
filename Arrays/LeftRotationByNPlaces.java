
import java.util.Arrays;

public class LeftRotationByNPlaces
{
    public static void rotateLeft(int[] arr, int k)
    {
        int length =arr.length;
        k=k%length;
        reverse(arr,0,k-1);
        reverse(arr,k,length-1);
        reverse(arr,0,length-1);
    }

    public static void reverse(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;
        rotateLeft(arr, n);
        System.out.println("Left rotated array: " + Arrays.toString(arr));
    }
}