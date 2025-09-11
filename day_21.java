import java.util.Scanner;
import java.util.Stack;

public  class ReverseAStackUsingRecursion{
    public static void reverseStack(Stack<Integer>stack){
        
        if(!stack.isEmpty()){
            int top=stack.pop();
            reverseStack(stack);
            insertAtBottom(stack,top);
        }
    }
    public static void insertAtBottom(Stack<Integer>stack,int element){
        //base case:stack is empty
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        insertAtBottom(stack, element);
        //push back the removed element
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total stack element want to push");
        int n=sc.nextInt();
        while(n>0){
            System.out.println("Enter the stack elememnt:");
            stack.push(sc.nextInt());
            n--;
        }
        System.out.println("Stack Initially:"+stack);
        reverseStack(stack);
        System.out.println("Reverse Stack:"+stack);
    }
}
