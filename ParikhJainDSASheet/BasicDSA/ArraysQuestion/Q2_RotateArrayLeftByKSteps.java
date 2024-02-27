package ParikhJainDSASheet.BasicDSA.ArraysQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_RotateArrayLeftByKSteps {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int k = 3;
        System.out.println(rotateArray(list, k));
    }

    static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k){
        int n = arr.size();
        k = k % n;

        reverseList(arr, 0, n-k);//First half reverse according to k window
        reverseList(arr, k, n-1);//After k window reverse
        reverseList(arr, 0, n-1);//whole the array reverse


    return arr;
    }

    static void reverseList(ArrayList<Integer> arr, int i, int j){
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }
}
