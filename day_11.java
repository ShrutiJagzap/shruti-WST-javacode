import java.util.*;

public class Permutation {
    public static void backtrack(char[] arr,boolean[] used,StringBuilder path,List<String> result){
        if(path.length()==arr.length){
            result.add(path.toString());
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && arr[i]==arr[i-1] && !used[i-1]){
                continue;
            }
            used[i]=true;
            path.append(arr[i]);
            backtrack(arr, used, path, result);
            path.deleteCharAt(path.length()-1);
            used[i]=false;
        }
    }
    public static List<String> permuteUnique(String s){
        List<String> result =new ArrayList<>();
        char[] arr= s.toCharArray();
        Arrays.sort(arr);
        boolean used[]=new boolean[arr.length];
        backtrack(arr,used,new StringBuilder(),result);
        return result;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.print(permuteUnique(s));
        
    }
    
}
