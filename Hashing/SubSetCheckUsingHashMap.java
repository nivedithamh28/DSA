
import java.util.HashMap;

public class SubSetCheckUsingHashMap
{
    public static boolean isSubSet(int[] arr1, int[] arr2)
    {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int num:arr1)
        {
            map.put(num,map.getOrDefault(num,0) + 1);

        }

        for(int num : arr2)
        {
            if(!map.containsKey(num) || map.get(num) == 0)
            {
                return false;
            }

            map.put(num, map.get(num) - 1);
        }

        return true;
    }

        public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 4};
        int[] arr2 = {2, 2, 3};

        System.out.println(isSubSet(arr1, arr2) ? "Yes" : "No"); // Output: Yes
    }
}
