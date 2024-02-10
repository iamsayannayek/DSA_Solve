package TheoryConcepts.Ch5_SortingAlgorithm;

import java.util.Arrays;

public class Th3_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, -32, -7, 23, 10};
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
