package TCS_NQT.Pr1_Arrays;

import java.util.Arrays;

public class Q3_SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};
        System.out.println(Arrays.toString(findLargeAndSmall(arr)));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    static int[] findLargeAndSmall(int[] arr){
        int[] ans = new int[2];

        //Find Second Largest Element
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int k : arr) {
            if (k == largest) {
                continue;
            } else if (k > largest) {
                secondLarge = largest;
                largest = k;
            } else if (k > secondLarge) {
                secondLarge = k;
            }
        }

        //Find Second smallest element
        int smallest = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j == smallest) {
                continue;
            } else if (j < smallest) {
                secondSmall = smallest;
                smallest = j;
            } else if (j < secondSmall) {
                secondSmall = j;
            }
        }
        ans[0] = secondLarge;
        ans[1] = secondSmall;
        return ans;
    }
}
