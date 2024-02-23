package TheoryConcepts.Ch6_RecursionAndBacktracking.Level1_Questions;

public class PrintNum_1_to_N {
    public static void main(String[] args) {
        anotherWay(5);
    }

    static void printNum(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    //Another way
    static void anotherWay(int n){
        if (n==0){
            return;
        }
        anotherWay(n-1);
        System.out.println(n);
    }
}
