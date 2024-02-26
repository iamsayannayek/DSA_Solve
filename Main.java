import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8};
        System.out.println(findSecondLargest(arr.length, arr));
    }
    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){
            if(arr[i] == arr[i - 1]){
                continue;
            }
            return arr[i - 1];
        }
        return -1;
    }
}