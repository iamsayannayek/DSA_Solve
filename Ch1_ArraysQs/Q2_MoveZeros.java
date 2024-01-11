package Ch1_ArraysQs;

import java.util.Arrays;

public class Q2_MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeros(int[] arr){
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }

        for(; j< arr.length; j++){
            arr[j] = 0;
        }
    }
}
