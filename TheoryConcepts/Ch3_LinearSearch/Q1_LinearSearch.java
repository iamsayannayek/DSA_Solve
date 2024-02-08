package TheoryConcepts.Ch3_LinearSearch;

import java.util.Arrays;

public class Q1_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 22, 77, 14, 67, 43, 87};
        int target = 14;
        System.out.println("[1D Array] Element found at index No: " + linearSearch1D(arr, target));

        int[][] arr2D = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target2D = 56;
        int[] ans = linearSearch2D(arr2D, target2D);
        System.out.println("[2D Array] Element found at index No: " + Arrays.toString(ans));
    }

    static int linearSearch1D(int[] arr, int target){
        if(arr.length == 0) return -1;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }

    static int[] linearSearch2D(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length ; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
