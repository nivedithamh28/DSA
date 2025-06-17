
import java.util.HashSet;

public class SubSetOfArrayHashSet
{
    public static boolean isSubSet(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr1)
        {
            set.add(num);
        }

        for(int num : arr2)
        {
            if(!set.contains(num))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 2, 7, 1};
        System.out.println(isSubSet(arr1,arr2)?"true" : "false");
    }
}