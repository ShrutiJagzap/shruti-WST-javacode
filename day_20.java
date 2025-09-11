import java.util.Scanner;
import java.util.Stack;

public class SortAStackUsingRecursion {
    public static void sortStack(Stack<Integer>stack){
       if(!stack.isEmpty()){
        //remove the top element
        int top=stack.pop();
        //Sort the remaining stack
        sortStack(stack);
        //insert the popped element in sorted order
        insertEleInSorted(stack,top);
       }
    }
    public static void insertEleInSorted(Stack<Integer>stack,int element){
        //Base case: stack empty or top<=element
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
            return;
        }
        //remove top
        int top=stack.pop();
        insertEleInSorted(stack, element);
        //put back the top ele
        stack.push(top);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Stack<Integer>stack=new Stack<>();
         System.out.print("Enter the  number of stack element:");
         int n=sc.nextInt();
         while (n>0) {
            System.out.print("stack element");
            stack.push(sc.nextInt());
            n--;
         }
         System.out.println("Original Stack:"+stack);
         sortStack(stack);
         System.out.println("Sorted stack:"+stack);


    }
    
}
