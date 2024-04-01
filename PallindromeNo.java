import java.util.*;
class PallindromeNo
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the num:");
      int num=sc.nextInt();
      int rev=0;
      int org=num;
      while(num!=0)
      {
        rev=rev*10+num%10;
        num/=10;
      } 
      if(rev==org)
      System.out.println(org+" is Pallindrome Number"); 
      else
      System.out.println(org+" is not a Pallindrome Number"); 

    }
}