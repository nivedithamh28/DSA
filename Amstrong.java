
import java.util.Scanner;

public class Amstrong 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        int original=num;
        int sum=0,digits=0;

        int temp=num;
        while(temp!=0)
        {
            temp/=10;
            digits++;
        }

        temp=num;
        while(temp>0)
        {
            int digit = temp%10;
            sum += Math.pow(digit,digits);
            temp/=10;
        }

        if(sum==original)
        {
            System.out.println("amstrong number");
        }
        else{
            System.out.println("Not a amstrtong");
        }
    }    
}
