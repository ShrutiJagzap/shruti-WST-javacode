import java.util.*;

public class day_02 {
    public static int findMissingElement(int arr[],int n){
        //expected sum of numbers from 1 to n
        long expectedSum=(long)n*(n+1)/2;
        //Actual sum of given array
        long actualSum=0;
        for(int num:arr){
            actualSum+=num;
        }
        return (int)(expectedSum-actualSum);
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n=sc.nextInt();
        System.out.print("Enter the array element:");
        int arr[]=new int[n];  
        for(int i=0;i<n-1;i++){
             arr[i]=sc.nextInt();
        }
        System.out.print("Missing Element in Array:"+findMissingElement(arr, n));
    }
    
}
