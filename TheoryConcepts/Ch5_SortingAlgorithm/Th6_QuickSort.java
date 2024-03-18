package TheoryConcepts.Ch5_SortingAlgorithm;

import java.util.Arrays;

public class Th6_QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 1, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;

        int start = low;
        int end = high;

        int mid = start + (end-start)/2;

        int pivot = arr[mid];

        while(start<=end){
            while (arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;

            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        //pivot is the correct index, now check for the two halves of the array
        // Means L.H.S of Pivot and R.H.S of Pivot;
        quickSort(arr, low, end); // For L.H.S
        quickSort(arr, start, high); // For R.H.S
    }
}
