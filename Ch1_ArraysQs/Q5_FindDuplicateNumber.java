package Ch1_ArraysQs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q5_FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int dupli = findDuplicate(arr);
        System.out.println(dupli);
    }
    //2nd Approach, But T: O(nlog(n))
    static int findDuplicateBySorting(int[] arr){
        Arrays.sort(arr);
        int duplicate = -1;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != (i+1)){
                duplicate = arr[i];
                return duplicate;
            }
        }
        return duplicate;
    }

    //3rd Approach By Use Hashset, Time: O(n) but Space: O(n)
    static int findDuplicateByHashSet(int[] arr){
        Set<Integer> list = new HashSet<>();
        int duplicate = -1;
        for (int j : arr) {
            if (!list.contains(j)) {
                list.add(j);
            } else {
                return j;
            }
        }
        return duplicate;
    }

    //Final & Efficient Approach: Using Hare & Tortoise Algorithm / Floyd Warshall Algorithm
    static int findDuplicate(int[] nums){
        //Start a fast & slow pointer until they meet
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        //As Soon as they meet, move both pointer at the same speed until they meet again
        //Return the meeting value, means slow value
        slow = 0;
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
