import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        recursiveSelection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    //Selection Sort using Recursion
    static void recursiveSelection(int[] arr, int n, int c, int max){
        if(n==0) return;
        if(c<n){
            if(arr[c]>arr[max]){
                recursiveSelection(arr, n, c+1, c);
            }else{
                recursiveSelection(arr, n, c+1, max);
            }
        }else{
            // int temp = arr[max];
            // arr[max] = arr[n-1];
            // arr[n-1] = temp;
            swap(arr, max, n-1);
            recursiveSelection(arr, n-1, 0, 0);
        }
    }


    //Bubble Sort using Recursion
    static void recursiveBubble(int[] arr, int n, int c){
        if(n==0) return;

        if(c<n){
            if(arr[c]>arr[c+1]){
//                int temp = arr[c];
//                arr[c] = arr[c+1];
//                arr[c+1] = temp;
                swap(arr, c, c+1);
            }
            recursiveBubble(arr, n, c+1);
        }else{
            recursiveBubble(arr, n-1, 0);
        }
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}