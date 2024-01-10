package TheoryConcepts.Ch1_ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr2D = new int[3][3];

        System.out.println("Enter the inputs of 2D Array");
        //Take input
        for (int row=0; row<arr2D.length; row++){
            for (int col=0; col<arr2D[row].length; col++){
                System.out.print("Enter the input of arr[" + row + "][" + col + "]: ");
                arr2D[row][col] = in.nextInt();
            }
        }
        // Output
//        for (int row=0; row<arr2D.length; row++){
//            for (int col=0; col<arr2D[row].length; col++){
//                System.out.print(arr2D[row][col] + "  ");
//            }
//            System.out.println();
//        }

        for (int[] row : arr2D) {
            System.out.println(Arrays.toString(row));
        }

    }
}
