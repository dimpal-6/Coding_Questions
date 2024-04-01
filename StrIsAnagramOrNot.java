// An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
// For example, “abcd” and “dabc” are an anagram of each other.

import java.util.*;
class StrIsAnagramOrNot
{
    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1:");
        String str1=sc.next();
        System.out.println("Enter the String2:");
        String str2=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:str1.toCharArray())
        map.put(i,map.getOrDefault(i,0)+1);
        for(char i:str2.toCharArray())
        {
            if(map.containsKey(i) && map.get(i)>0)
            {
                if(map.get(i)==1)
                map.remove(i);
                else
                map.put(i,map.getOrDefault(i,0)-1);
            }
            else 
            {
                flag=1;
                break;
            }
        }
        if(map.size()>0 || flag==1)
        System.out.println(str1+" and "+str2+" are not anagrams of each other");
        else        
        System.out.println(str1+" and "+str2+" are anagrams of each other");
    }
}