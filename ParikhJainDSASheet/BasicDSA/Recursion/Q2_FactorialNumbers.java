package ParikhJainDSASheet.BasicDSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q2_FactorialNumbers {
    public static void main(String[] args) {
        Long n = 7L;
        System.out.println(factorialNumbers(n));
    }
    static List<Long> factNums = new ArrayList<>();
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        for(long i=1; i<=n; i++){
            long fact = fact(i);
            if(fact<=n){
                factNums.add(fact);
                if(fact>=n){
                    break;
                }
            }
        }
        return factNums;
    }

    static long fact(long n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
}
