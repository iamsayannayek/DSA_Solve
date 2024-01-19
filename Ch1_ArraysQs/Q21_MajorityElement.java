package Ch1_ArraysQs;

public class Q21_MajorityElement {
    public static void main(String[] args) {

    }
    static int majorityElement(int[] nums) {
        int el = nums[0];
        int c1 = 0;
        //Pick the element
        for (int num : nums) {
            if (c1 == 0) {
                c1 = 1;
                el = num;
            } else if (num == el) {
                c1++;
            } else {
                c1--;
            }
        }

        int c2 = 0;
        //Verify the Majority
        for (int num : nums) {
            if (num == el) {
                c2++;
            }
        }

        if(c2 > (nums.length/2)){
            return el;
        }

        return -1;
    }
}
