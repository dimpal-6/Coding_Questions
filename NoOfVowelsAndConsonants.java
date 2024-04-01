import java.util.*;
class NoOfVowelsAndConsonants
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        int vowels=0,consonants=0;
        for(char ch:str.toCharArray())
        {
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            vowels++;
            else
            consonants++;
        }
        System.out.println("No of vowels and consonants in "+str+" are "+vowels+" and "+consonants);
    }
}