package Practice;

public class Factorial {
    public static void main(String[] args) {
        long n =39L;
        System.out.println("Factorial Recursion "+factorialRecursion(n));
        System.out.println("Factorial Iterative "+ factorialIterative(n));
    }

    private static long factorialRecursion(long n){
        if(n==2){
            return 2;
        }
        return n * factorialRecursion(n-1);
    }

    private static long factorialIterative(long n){
        long ans=1;
        for(long i=2;i<=n;i++) {
            ans*=i;
        }
        return ans;
    }
}
