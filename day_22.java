import java.util.HashMap;
import java.util.Map;

public class FirstElementRepeatKTimes {
    public static int findElement(int arr[],int k){
        Map<Integer,Integer>freq=new HashMap<>();
        //step1:Count frequency
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        //step2: find first element with frequency==k
        for(int num:arr){
            if(freq.get(num)==k){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,1,4,4,5,2,6,1,4};
        int k=2;
        System.out.print(findElement(arr, k));
    }
    
}
