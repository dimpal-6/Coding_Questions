// Que 20
import java.util.*;
public class WordWithHighestNoOfRepeatedLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        String ans="";
        int noOfRepLetter=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            HashMap<Character,Integer> map=new HashMap<>();
            for(char ch:arr[i].toCharArray())
            {
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(char ch:map.keySet())
            {
                if(map.get(ch)>1)
                count++;
            }
            if(noOfRepLetter<count)
            {
                noOfRepLetter=count;
                ans=arr[i];
            }
        }
        if(noOfRepLetter==0)
        System.out.println("-1");
        else
        System.out.println(ans);
    }
}
