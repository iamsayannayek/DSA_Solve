package A2Z_DSASheet.Ch1_ArraysQs.EasyQs;

import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(longestSubarrayWithSumK(arr, 3));
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int maxLen = 0;
        int right = 0, left = 0;
        int sum = a[0];
        int count = 0;

        while(right<a.length){
            if(left<=right && sum>k){
                sum -= a[left];
                left++;
            }

            if(sum==k){
                maxLen = Math.max(maxLen, right-left+1);
                count++;
            }
            right++;
            if(right<a.length){
                sum+= a[right];
            }
        }

        return count;
    }
}
