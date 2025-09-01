import java.util.*;

public class CountTheNumberOfDivisors {
    public static List<Integer> numberOfDivisors(int n){
       List<Integer> result= new ArrayList<>();
       result.add(1);
       int count=1;
        for(int i=2;i<=n;i++){
            if(n % i == 0){
                result.add(i);
                count ++;
            }else{
                continue;
            }
        }
        System.out.print(count);
        System.out.println();
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.print("Number of Divisors:"+numberOfDivisors(n));
    }
    
}
