import java.util.*;

public class RotateArrElementsByKPos {
    static void reverse(int start,int end,int[] arr)
    {
        for(int i=start;i<(end+start)/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[end+start-(i+1)];
            arr[end+start-(i+1)]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        // Brute Force
        /*int firstKElements[]=new int[k];
        for(int i=0;i<k;i++)
        firstKElements[i]=arr[i];
        for(int i=k;i<n;i++)
        {
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++)
        {
            arr[i]=firstKElements[i-n+k];
        }*/

        // Optimal Approach
        reverse(0,k,arr);
        reverse(k,n,arr);
        reverse(0,n,arr);

        System.out.println("Array Elements after rotating left by k position:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
