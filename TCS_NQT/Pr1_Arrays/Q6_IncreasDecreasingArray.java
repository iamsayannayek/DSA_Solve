package TCS_NQT.Pr1_Arrays;

import java.util.Arrays;

public class Q6_IncreasDecreasingArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 15, 5, 9, 20};
        System.out.println(Arrays.toString(arr));
        increaseDecrease(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void increaseDecrease(int[] arr){
        Arrays.sort(arr);
        int i= arr.length/2;
        int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
