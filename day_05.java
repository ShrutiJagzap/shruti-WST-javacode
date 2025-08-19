import java.util.*;

public class FindTheLeader {
    public static List<Integer> leader(int arr[]){
        List<Integer> leaders=new ArrayList<>();
        int maxFromRight=arr[arr.length-1];
        leaders.add(maxFromRight);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxFromRight){
                maxFromRight=arr[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n=sc.nextInt();
        System.out.print("Enter the element in array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The LeaderS:"+leader(arr));
        
    }
    
}
