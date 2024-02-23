package TheoryConcepts.Ch6_RecursionAndBacktracking.Level1_Questions;

public class PrintNumbers_N_to_1 {
    public static void main(String[] args) {
        printNum(5);
    }
    static void printNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
}
