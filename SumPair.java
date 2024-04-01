// Que 19

import java.util.*;

public class SumPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the target sum:");
        int target=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        int j=0;
        for(;j<n;j++)
        {
            if(al.contains(target-arr[j]))
            break;
            al.add(arr[j]);
        }
        if(j==n)
        System.out.println("-1");
        else
        System.out.println((al.indexOf(target-arr[j])+1)+" "+(j+1));
    }
}
