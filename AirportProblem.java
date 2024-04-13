// Que 25
import java.util.*;
public class AirportProblem {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of passangers:");
    int n=sc.nextInt();
    System.out.println("Enter the weight of luggages of passenger:");
    int lugg[]=new int[n];
    for(int i=0;i<n;i++)
    lugg[i]=sc.nextInt();
    System.out.println("Enter the threshold value of boundary wall:");
    int t=sc.nextInt();
    int amount=0;
    for(int i=0;i<n;i++)
    {
        if(lugg[i]>t)
        amount+=2;
        else
        amount++;
    }
    System.out.println("Amount required to pay: "+amount);
}
    
}