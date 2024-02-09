package TheoryConcepts.Ch4_BinarySearch;

import java.util.Arrays;

public class Q3_RowCalSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 23, 34, 40},
                {11, 25, 35, 42},
                {17, 28, 37, 45},
                {19, 30, 48, 50}
        };
        int target = 48;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }

            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
