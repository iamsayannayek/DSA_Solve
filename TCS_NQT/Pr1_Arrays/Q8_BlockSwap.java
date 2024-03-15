package TCS_NQT.Pr1_Arrays;

import java.util.Arrays;

public class Q8_BlockSwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int r = 2;
        System.out.println(Arrays.toString(blockSwap(arr, r)));
    }

    static int[] blockSwap(int[] arr, int r){
        int n = arr.length;
        r %=n;

        if(r==0 || r==n) return arr;

        int A = r;
        int B = n-r;

        while (A!=B){
            if(A<B){
                swap(arr, r-A, r-A+B, A);
                B = B-A; //Length B reduce by A
            }else{
                swap(arr, r-A, r, B);
                A = A-B;//Reduced By B length
            }
        }

        swap(arr, r-A, r, A);
        return arr;

    }
    static void swap(int[] arr, int aIndex, int bIndex, int n){
        for (int i=0; i<n; i++){
            int temp = arr[aIndex+i];
            arr[aIndex+i] = arr[bIndex+i];
            arr[bIndex+i] = temp;
        }
    }
}

//Python Code
//def block_swap(arr, r):
//n = len(arr)
//r %= n
//
//    if r == 0 or r == n:
//        return arr
//
//        A = r
//B = n - r
//
//    while A != B:
//        if A < B:
//swap(arr, r - A, r - A + B, A)
//B = B - A  # Length B reduce by A
//        else:
//swap(arr, r - A, r, B)
//A = A - B  # Reduced By B length
//
//swap(arr, r - A, r, A)
//    return arr
//
//
//def swap(arr, a_index, b_index, n):
//        for i in range(n):
//temp = arr[a_index + i]
//arr[a_index + i] = arr[b_index + i]
//arr[b_index + i] = temp
//
//
//arr = [1, 2, 3, 4, 5]
//r = 2
//print(block_swap(arr, r))