package ParikhJainDSASheet.BasicDSA.Recursion;

public class Q5_FindXraisedToPowerN {
    public static void main(String[] args) {
        System.out.println(myPow(2, 3));
    }
    public static double myPow(double x, int n) {
        if(n==0) return 1;

        if(n>0){
            return myPow(x, n-1)*x; //For 2^3
        }
        return myPow(x, n+1)/x; //For 2^(-3)
    }
}
