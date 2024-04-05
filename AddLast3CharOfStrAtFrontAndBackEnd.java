// Que 23
import java.util.*; 
public class AddLast3CharOfStrAtFrontAndBackEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next(); 
        int n=str.length();
        System.out.println("Updated String:"+(str.substring(n-3,n)+str+str.substring(n-3,n)));
    }
}
