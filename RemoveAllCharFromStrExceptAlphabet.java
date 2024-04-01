import java.util.*;
public class RemoveAllCharFromStrExceptAlphabet {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String ans="";
      String s=sc.next();
      for(Character ch:s.toCharArray())
      {
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        ans+=ch;
      } 
      System.out.println("Updated String:"+ans); 
    }
}
