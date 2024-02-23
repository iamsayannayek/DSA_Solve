package TheoryConcepts.Ch6_RecursionAndBacktracking.Level1_Questions;

public class Q4_SumOf_Nto1 {
    public static void main(String[] args) {
        System.out.println(sumOfNto1(5));
    }

    static int sumOfNto1(int n){
        if(n<=1){
            return 1;
        }
        return n + sumOfNto1(n-1);
    }
}
