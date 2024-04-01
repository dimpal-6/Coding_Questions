import java.util.*;
public class FindRowWithMaxNoOf1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int m=sc.nextInt();
        System.out.println("Enter no. of columns:");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int maxOne=0,ans=-1;
        for(int i=0;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                count++;
            }
            if(maxOne<count)
            {
            maxOne=count;
            ans=i;
            }
        }
        System.out.println("Row with maximum 1's: "+(ans+1));
    }
}
