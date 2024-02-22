package TheoryConcepts.Ch6_RecursionAndBacktracking;

public class Q1_NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    static int fibonacci(int n){
        if(n<2){ //Base Condition
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
