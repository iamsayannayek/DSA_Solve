package Ch1_ArraysQs;

import java.util.Arrays;

public class RotateArrayByKSteps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        if(k==0 || k==n) return;

        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
    }

    static void reverseArray(int[] arr, int start, int end){
        if(start>end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start+1, end-1);
    }
}
