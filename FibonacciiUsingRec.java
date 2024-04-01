import java.util.*;

public class FibonacciiUsingRec {
    static void fibb(int[] arr,int n,int i)
    {
        if(i==n)
        return;
        arr[i]=arr[i-1]+arr[i-2];
        fibb(arr,n,++i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=0;
        if(n>=2)
        {
        arr[1]=1;
        fibb(arr,n,2);
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
