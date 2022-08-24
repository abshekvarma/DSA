package Practice;

public class Fibonacci {
    public static void main(String[] args) {
        int n=8;
        System.out.println("Fibonacci Recursion "+fibonacciRecursion(n));
        System.out.println("Fibonacci Iterative "+fibonacciIterative(n));
    }

    private static int fibonacciIterative(int n) {
        int[] arr ={0,1};
        for(int i=2;i<n;i++){
        }
        return 1;
    }

    private static int fibonacciRecursion(int n) {
        if(n<2){
            return n;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
}
