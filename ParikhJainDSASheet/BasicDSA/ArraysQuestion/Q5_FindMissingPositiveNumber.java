package ParikhJainDSASheet.BasicDSA.ArraysQuestion;

public class Q5_FindMissingPositiveNumber {
    public static void main(String[] args) {

    }

    public static int firstMissing(int[] arr, int n) {
        // Write your code here.
        //Making relace all -ve & 0 values
        for(int i=0; i<n; i++){
            if(arr[i]<=0){
                arr[i] = n+1;
            }
        }

        //Mark the visited value
        for(int i=0; i<n; i++){
            int index = Math.abs(arr[i])-1;
            if(index < n){
                arr[index] *= -1;
            }
        }

        //Now find out the missing one
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
