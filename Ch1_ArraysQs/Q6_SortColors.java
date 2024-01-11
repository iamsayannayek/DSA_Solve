package Ch1_ArraysQs;

import java.util.Arrays;

public class Q6_SortColors {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;
                case 1: mid++;
                    break;
                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }

    static void swap(int[] nums, int pos1, int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
