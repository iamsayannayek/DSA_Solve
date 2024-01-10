package TheoryConcepts.Ch1_ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class ConceptsOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        // datatype[] variableName = new int[size];
        int[] arr1 = new int[5];
        int[] arr = {23, 45, 232, 32, 31};

        int[] arr2; //Declaration of Array: arr2 is defined in the task
        arr2 = new int[5]; // Creating the object in heap memory

        //Array Input
        System.out.println("Enter the inputs: ");
        for(int i=0; i<arr2.length; i++){
            System.out.print("Input" + i + ": ");
            arr2[i] = in.nextInt();
        }
        System.out.println();
        //Array Output:
        System.out.println("Output: ");
//        for(int i=0; i<arr2.length; i++){
//            System.out.println(arr2[i]);
//        }

        //forEach loop
        for(int num : arr2){
            System.out.println(num);
        }

        //Another way to print array
        System.out.println(Arrays.toString(arr));
    }
}
