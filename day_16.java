import java.util.Scanner;

public class LeastCommonMultipleOfTwoNum {
    //Given two number N and M.
    //find LCM(lcm is the smallest positive integer that is divisible by both N and M)

    //function to calculate GCD(Greatest Common Divisor) using Euclidean Algorithm
    public static long gcd(long n,long m){
        while (m!=0) {
          long temp=m;
          m=n%m;
          n=temp;

        }
        return n;
    }
    //function to calculate lcm
    public static long lcm(long n,long m){
        return(n/gcd(n, m))*m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        long n=sc.nextLong();
        System.out.println("Enter the second number:");
        long m=sc.nextLong();
        System.out.print(lcm(n,m));
        sc.close();
    }
    
}
