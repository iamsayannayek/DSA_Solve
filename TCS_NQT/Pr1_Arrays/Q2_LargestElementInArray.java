package TCS_NQT.Pr1_Arrays;

public class Q2_LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};
        System.out.println(largestElement(arr));
    }

    static int largestElement(int[] arr) {
        // Write your code here.
        int large = Integer.MIN_VALUE;
        for(int i:arr){
            if(large<i){
                large = i;
            }
        }
        return large;
    }
}
