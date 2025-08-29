import java.util.HashMap;
import java.util.Map;

public class CountSubstringWithExactlyKDistinctChar {
    public static int helper(String s,int k){
        int n=s.length();
        int left=0,result=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
            while (freq.size()>k) {
                char leftChar=s.charAt(left);freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                left++;
            }
            result+=i-left+1;
        }
        return result;

    }
    public static int countSubstring(String s,int k){
        if(k == 0){
            return 0;
        }
        return helper(s, k)-helper(s, k-1);
    }
    public static void main(String[] args) {
        String s="pqpqs";
        int k=2;
        System.out.print(countSubstring(s, k));
    }
    
}
