package Ch1_ArraysQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q14_4Sum {
    public static void main(String[] args) {

    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        long sum = 0;
        long temp; // (n3 + n4) = target - (n1 + n2 + n3)

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) { //Skip the duplicates
                        temp = (long) target - (long) nums[i] - (long) nums[j]; //(n3 + n4) value assign
                        int k = j + 1; //start pointer
                        int l = nums.length - 1;//end pointer

                        while (k < l) {
                            sum = (long) nums[k] + (long) nums[l];

                            if (sum == temp) { //If Sum == Temp means we find n4 value
                                //Added the value into answer list
                                ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                                while (k < l && nums[l] == nums[l - 1])
                                    l--; //Skip the answer duplicates
                                while (k < l && nums[k] == nums[k + 1])
                                    k++; //Skip the answer duplicates
                                l--; //Check for the next value
                                k++;
                            } else if (sum < temp) {
                                k++; //Increase the start pointer
                            } else {
                                l--; //Decrease the end pointer
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
