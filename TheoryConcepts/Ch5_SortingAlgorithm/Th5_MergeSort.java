package TheoryConcepts.Ch5_SortingAlgorithm;

import java.util.Arrays;

public class Th5_MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 2, 0};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArr(leftArr, rightArr);
    }

    static int[] mergeArr(int[] leftArr, int[] rightArr){
        int[] mix = new int[leftArr.length + rightArr.length];
        int i=0;
        int j=0;
        int k=0; // Point to the mix array

        while (i< leftArr.length && j< rightArr.length){
            if(leftArr[i]<rightArr[j]){
                mix[k] = leftArr[i];
                i++;
            }else{
                mix[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i< leftArr.length){
            mix[k] = leftArr[i];
            i++;
            k++;
        }

        while(j< rightArr.length){
            mix[k] = rightArr[j];
            j++;
            k++;
        }
        return mix;
    }
}
