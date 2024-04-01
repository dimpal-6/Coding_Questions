import java.util.*;

public class CommonElementsBet2Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the elements of array1:");
        for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();
        System.out.println("Enter the size of array2:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the elements of array2:");
        for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n1;i++)
        map.put(arr1[i],1);
        System.out.println("Common Elements:");
        for(int i=0;i<n2;i++)
        {
            if(map.containsKey(arr2[i]))
            System.out.print(arr2[i]+" ");
        }
    }
}
