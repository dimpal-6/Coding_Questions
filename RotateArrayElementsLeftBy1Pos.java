import java.util.*;

class RotateArrayElementsLeftBy1Pos
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int firstElement=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=firstElement;
        System.out.println("Array Elements after rotating left by 1 position:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}