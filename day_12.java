import java.util.*;

public class ValidParentheses {
    public static boolean validString(String str){
        if(str.length()==0){
            return true;
        }
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='['&& ch==']')){
                    return true;
                }else{
                    return false;
                }

            }
        }
            return false;
    }
    
    public static void main(String args[]){
        // String str="()[]{}";
        // String str="([)]";
        // String str="[{()}]";
        // String str="";
        String str="{[}";
       System.out.println(validString(str));
    }
    
}
