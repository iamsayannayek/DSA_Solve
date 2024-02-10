package TheoryConcepts.Ch5_SortingAlgorithm;

import java.util.Arrays;

public class Th2_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, -32, -7, 23, 10};
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapped(arr, maxIndex, last);
        }
    }

    static void swapped(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
