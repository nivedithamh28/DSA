
import java.util.PriorityQueue;



public class KthSmallestNumberInArray
{
    public static int findKthElement(int[] arr, int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr)
        {
            minHeap.add(num);

        }

        for(int i=0;i<k-1;i++)
        {
            minHeap.poll();
        }

        return minHeap.peek();

    }
    public static void main(String[] args) {
        int[] arr ={7,10,4,3,20,15};
        int k = 3;
        System.out.println(findKthElement(arr, k));

    }
}