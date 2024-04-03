/*Date 03/04/2024
TCS NQT Sept 2023
A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of 
integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0].
There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of 
the array
Input :
8  – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
Output:
4 5 1 9 5 0 0 0
*/

import java.util.Scanner;
class ChocFactoryTCSNQT
{
    static void swap(int i,int j,int arr[])
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt(); 
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                swap(i,j,arr);
                j++;
            }
        }
        System.out.println("Array Elements after moving 0's at end:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}