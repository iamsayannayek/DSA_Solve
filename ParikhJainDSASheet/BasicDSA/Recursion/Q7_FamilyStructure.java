package ParikhJainDSASheet.BasicDSA.Recursion;

public class Q7_FamilyStructure {
    public static void main(String[] args) {
        System.out.println(kthChildNthGeneration(3, 4));
    }

    public static String kthChildNthGeneration(int n, long k) {
        if(checkChild(n, k)){
            return "Female";
        }
        return "Male";
    }

    static boolean checkChild(int n, long k){
        if(n==1 || k==1){
            return false;
        }

        if(k%2 == 0){
            return !checkChild(n-1, k/2);
        }
        return checkChild(n-1, (k+1)/2);
    }
}
