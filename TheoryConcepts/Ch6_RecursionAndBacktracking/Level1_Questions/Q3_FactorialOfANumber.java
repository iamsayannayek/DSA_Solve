package TheoryConcepts.Ch6_RecursionAndBacktracking.Level1_Questions;

import java.util.Scanner;

public class Q3_FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("The Factorial = " + fact(n));
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }

}
