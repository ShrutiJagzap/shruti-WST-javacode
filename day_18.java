import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluatePostfixExpression {
    public static int evalPostfix(String expr){
        if(expr==null || expr.trim().isEmpty()){
             throw new IllegalArgumentException("Empty expression");
        }
        Deque<Long> stack=new ArrayDeque<>();
        String[] tokens=expr.trim().split("\\s+");
        for(String tok:tokens){
            try{
                long num =Long.parseLong(tok);
                stack.push(num);
            }catch (NumberFormatException e){
                if(stack.size()<2){
                    throw new IllegalArgumentException("Invalid expression:insufficient operands for operator"+tok);
                }
                    long b=stack.pop();
                    long a=stack.pop();
                    long res;
                    switch (tok) {
                        case "+":
                        res=a+b;
                            break;
                        case "-":
                        res=a-b;
                        break;
                        case "*":
                        res=a*b;
                        break;
                        case "/":  
                        if(b==0){
                            throw new IllegalArgumentException("Division by zero");
                        }
                        res=a/b;
                        break;
                        case "^":
                        res=a^b;
                        break;                          
                        default:
                        throw new UnsupportedOperationException("Unsupported operator:"+tok);
                    }
                 stack.push(res);
            }
            
        }
        if(stack.size()!=1){
                throw new IllegalArgumentException("Invalid expression:leftover values on stack");
            }
           
         return stack.pop().intValue();
    }
    public static void main(String[] args) {
        // String expr="1 2 * 5 6 - + ";
        String expr="3 4 2 * 1 5 - 2 3 ^ ^ / +";
        System.out.print("Output"+evalPostfix(expr));
    }
    
}
