package TheoryConcepts.Ch6_RecursionAndBacktracking.Level1_Questions;

public class Q6_DigitProduct {
    public static void main(String[] args) {
        System.out.println(digitProduct(55));
    }

    static int digitProduct(int n){
        if(n%10==n){
            return n;
        }

        return (n%10) * digitProduct(n/10);
    }
}
