import java.util.*;
public class ReplaceConsecutiveRepLettersByThierOccr {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String:");
       String s=sc.next();
       int cnt=1,i=0; 
       while(i<s.length()-1)
       {
            if(s.charAt(i)==s.charAt(i+1))
            {
                cnt++;
                i++;
            }
            else
            {
                s=s.substring(0, i-cnt+2)+String.valueOf(cnt)+s.substring(i+1, s.length());
                i=(i-cnt+3);
                cnt=1;
            }
       }
       s=s.substring(0, i-cnt+2)+String.valueOf(cnt);
       System.out.println("Updated String: "+s);
    }
}
