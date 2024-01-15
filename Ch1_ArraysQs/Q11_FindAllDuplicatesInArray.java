package Ch1_ArraysQs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q11_FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 2, 5, 3, 3};
        System.out.println(findDuplicates(arr));
    }
    //Method2: Optimal One, TC(O(n); SC:O(1)
    static List<Integer> findDuplicates(int[] nums){
        List<Integer> resultSet = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1; //indexToCheck

            //If the element is already negative then the element encountering twice
            if(nums[index] < 0){
                resultSet.add(index + 1);
            }

            //Flip the Number into negative
            nums[index] = nums[index] * (-1);
        }
        return resultSet;
    }
    //Method 1: Using HasSet, TC:O(n), SC: O(n)
    static List<Integer> findDuplicatesHashSet(int[] nums){
        HashSet<Integer> result = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                result.add(num);
            }
        }
        return result.stream().toList();
    }
}
