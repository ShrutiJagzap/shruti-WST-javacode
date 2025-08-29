import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
    public static int lengthOfSubstring(String s){
        Map<Character,Integer> lastSeen=new HashMap<>();
        int left=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //if character already seen move left pointer
            if(lastSeen.containsKey(c)){
                left=Math.max(left, lastSeen.get(c)+1);
            }
            //Store/update last seen index
            lastSeen.put(c, i);
            //update max length
            maxLen=Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.print(lengthOfSubstring(s));
    }
    
}
