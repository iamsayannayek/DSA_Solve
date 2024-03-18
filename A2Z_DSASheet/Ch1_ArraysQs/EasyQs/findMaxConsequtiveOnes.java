package A2Z_DSASheet.Ch1_ArraysQs.EasyQs;

public class findMaxConsequtiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxOne = Math.max(maxOne, count);
            } else {

                count = 0;
            }
        }
//        maxOne = Math.max(maxOne, count);
        return maxOne;
    }
}
