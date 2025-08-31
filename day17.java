import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizationOfNum {
    public static List<Integer> primeFactors(int n){
        List<Integer> factors=new ArrayList<>();
        //Handle 2 separately(even numbers)
        while(n%2==0){
            factors.add(2);
            n/=2;
        }

        //Check odd numbers from 3 up to sqrt(n)
        for(int i=3;n>=i*i;i+=2){
            while(n%i==0){
                factors.add(i);
                n/=i;
            }
        }

        //If n is still>2,it must be prime
        if(n>2){
            factors.add(n);
        }
        return factors;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer number:");
        int n=sc.nextInt();
        System.out.print("Prime factorization of "+ n+":"+primeFactors(n));
    }
    
}
