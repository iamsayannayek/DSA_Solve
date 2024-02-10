package TheoryConcepts.Ch5_SortingAlgorithm;

import java.util.Arrays;

public class Th4_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2}; // Input should be given in 1-->N range; N=>Size of the array
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
