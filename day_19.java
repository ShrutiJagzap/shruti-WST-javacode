import java.util.Stack;

public class EvaluatePostfixExpression {
    public static int evalPostfix(String expr){
       Stack<Integer>stack=new Stack<>();
        String tokens[]=expr.trim().split("\\s+");  //split by spaces
        for(String token:tokens){
            if(isOperator(token)){
                //need at least two number in stack
                if(stack.size()<2){
                    throw new IllegalArgumentException("Invalid Postfix Expression");
                }
                int b=stack.pop();
                int a=stack.pop();
                switch (token) {
                    case "+":
                    stack.push(a+b);
                    break;
                    case "-":
                    stack.push(a-b);
                    break;
                    case "*":
                    stack.push(a*b);
                    break;
                    case "/":
                    stack.push(a/b);
                    break;
                    case "^":
                    stack.push(a^b);
                    break;
                }
            }else{
                //Handle negative number like -5
                stack.push(Integer.parseInt(token));
            }
        }
        if(stack.size() !=1){
            throw new IllegalArgumentException("Invalid Postfix Expression");
        }
        return stack.pop();
    }
    private static boolean isOperator(String token){
        return token.equals("+") ||token.equals("-") ||token.equals("*") ||token.equals("/") ||token.equals("^");
    }
    public static void main(String[] args) {
        // String expr="1 2 * 5 6 - + ";
        // String expr="3 4 2 * 1 5 - 2 3 ^ ^ / +";
        String expr="-5 6 -";
        System.out.print("Output"+evalPostfix(expr));
    }
    
}
