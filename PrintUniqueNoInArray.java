import java.util.*;

class PrintUniqueNoInArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])==1)
            System.out.print(arr[i]+" ");
        }
        
    }
}