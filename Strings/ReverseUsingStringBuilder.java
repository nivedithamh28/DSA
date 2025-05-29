public class ReverseUsingStringBuilder
{
    public static String reverse(String str)
    {
        String rev = new StringBuilder(str).reverse().toString();
        return rev;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }
}