package TheoryConcepts.Ch6_RecursionAndBacktracking;

public class RecursionBasic {
    public static void main(String[] args) {
        //Print a number 1 to 5 without using Iteration & with one function
        print(1);
    }

    static void print(int n){
        if(n==5){ //This if function is called the Base Condition, where function didn't call itself recursively
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1); //This is called Tail Recursion because this is the last call function
    }
}
