// A string is a pangram string if it contains all the character of the alphabets ignoring the case of the alphabets. 
// Examples: Input: str = “Abcdefghijklmnopqrstuvwxyz” 

import java.util.*;
public class StrIsPangramOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next(); 
        str=str.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++)
        {
            map.put((char)(i+97),0);
        }
        for(char ch:str.toCharArray())
        map.put(ch,map.getOrDefault(ch,0)+1);
        int flag=0;
        for(char ch:map.keySet())
        {
            if(map.get(ch)==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("Given string is not pangram");
        else
        System.out.println("Given string is pangram");
    }
}
