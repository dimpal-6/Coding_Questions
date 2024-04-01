import java.util.*;
public class RemoveDupFromArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        set.add(arr[i]);
        System.out.println("Array Elements after removing duplicates:");
        for(int i:set)
        System.out.print(i+" ");
    }
}
