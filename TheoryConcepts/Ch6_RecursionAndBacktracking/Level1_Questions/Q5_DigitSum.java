package TheoryConcepts.Ch6_RecursionAndBacktracking.Level1_Questions;

public class Q5_DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(1342));
    }

    static int digitSum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + digitSum(n/10);
    }
}
