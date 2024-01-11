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
        //int col[m] = matrix[0][...]
        //int row[n] = matrix[...][0]
        int col0 = 1;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    //mark the i-th row
                    matrix[i][0] = 0;
                    //mark the j-th col
                    if(j!=0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }
        //Mark the inner matrix
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for (int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
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
