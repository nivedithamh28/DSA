
import java.util.HashMap;

public class RomanToInt
{
    public static int romanToInt(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total =0;
        for(int i=0;i<str.length();i++)
        {
           int currentValue = map.get(str.charAt(i));

           if(i+1 < str.length() && map.get(str.charAt(i+1)) > currentValue)
           {
                total = total-currentValue;
           }
           else
            total = total+currentValue;

        }
         return total;



    }
    public static void main(String[] args) {
        String str = "III";
        int res = romanToInt(str);
        System.out.println(res);


    }
}