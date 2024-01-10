package TheoryConcepts.Ch1_ArraysArrayLists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPassingThroughFunction {
    public static void main(String[] args) {
        int[] arr = {23, 45, 232, 32, 31};
        System.out.println("Before Changing: " + Arrays.toString(arr));
        // Before Changing: [23, 45, 232, 32, 31]
        changeMe(arr);
        System.out.println("After Changing: " + Arrays.toString(arr));
        // After Changing: [1245, 45, 232, 32, 31]
    }

    static void changeMe(int[] arr){
        arr[0] = 1245;
    }
}
