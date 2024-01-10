package Ch1_ArraysQs;

import java.util.Arrays;

public class Q1_SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        System.out.println("Before");
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("After");
        setZeroes(arr);
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }

    static void setZeroes(int[][] matrix){

    }
    // It takes extra space so it's not optimize
    static void setZeroesExtraSpace(int[][] matrix) {
        int[] rowMark = new int[matrix.length];
        int[] colMark = new int[matrix[0].length];
        //First mark the zeros
        for(int row=0; row< matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++){
                if(matrix[row][col] == 0){
                    rowMark[row] = -1;
                    colMark[col] = -1;
                }
            }
        }
        //Set Zeros
        for(int row=0; row< matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++){
                if(rowMark[row] == -1 || colMark[col]==-1){
                    matrix[row][col] = 0;
                }
            }
        }
    }
}
