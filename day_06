import java.util.*;

public class FindZeroSubarraySum {
    public static List<int[]> zeroSubarraySum(int[] arr){
        List<int[]>result=new ArrayList<>();
        Map<Long,List<Integer>> map=new HashMap<>();
        long prefixSum=0;
        //put prefix sum=0 at index -1
        //(to handle subarray starting at index 0)
        map.put(0L,new ArrayList<>(Arrays.asList(-1)));
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            //if pprefix sum seen before,all subarrays between previous indices and current from zero sum
            if(map.containsKey(prefixSum)){
                for(int startIndex:map.get(prefixSum)){
                    result.add(new int[] {startIndex +1,i});
                }
            }
            //store this index in the map for current prefixSum
            map.computeIfAbsent(prefixSum,k->new ArrayList<>()).add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,3,2,3,-2};
        // System.out.println(zeroSubarraySum(arr));
        for(int[] sub:zeroSubarraySum(arr)){
            System.out.println("("+sub[0]+","+sub[1]+")");
        }
    }
    
}
