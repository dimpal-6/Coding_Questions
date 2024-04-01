// An Armstrong number is a special kind of number in math. It's a number that equals the sum of its digits, 
// each raised to a power. 
//For example, if you have a number like 153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.

import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num:");
        int num=sc.nextInt();
        int len=0;
        int org=num;
        while(num!=0)
        {
            num/=10;
            len++;
        }
        num=org;
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum+=((int)(Math.pow(rem,len)));
            num/=10;
        }
        if(sum==org)
        System.out.println(org+" is armstrong number");
        else
        System.out.println(org+" is not an armstrong number");
    }
}
