import java.util.*;

class Sort1stHalfInAscLastInDesc
{
    static void sortAsc(int arr[],int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            for(int j=start;j<end-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void sortDesc(int arr[],int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            for(int j=start;j<end-i;j++)
            {
                if(arr[j+end]<arr[j+1+end])
                {
                    int temp=arr[j+end];
                    arr[j+end]=arr[j+1+end];
                    arr[j+1+end]=temp;
                }
            }
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
        sortAsc(arr,0,(int)Math.ceil(n/2));
        sortDesc(arr,0,(int)Math.ceil(n/2));
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}