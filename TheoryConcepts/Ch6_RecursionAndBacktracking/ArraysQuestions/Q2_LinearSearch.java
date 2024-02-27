package TheoryConcepts.Ch6_RecursionAndBacktracking.ArraysQuestions;

import java.util.ArrayList;

public class Q2_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 7, 8};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex2(arr, 5, 0));

    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }else {
            return findIndex(arr, target, index+1);
        }
    }

    //With argument passed
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    //Without Argument passed
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
