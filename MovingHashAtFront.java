import java.util.*;
class MovingHashAtFront
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String:"); 
      String str=sc.next();
      int cnt=0;
      int i=0;
      while(i<str.length())
      {
        if(str.charAt(i)=='#')
        {
         cnt++;
         str=str.substring(0, i)+str.substring(i+1,str.length());
        }
        else  
        i++;
    }
    for(int j=0;j<cnt;j++)
    str+='#';
    System.out.println("Updated String: "+str);
}
}