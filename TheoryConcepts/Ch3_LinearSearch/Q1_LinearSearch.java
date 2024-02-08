package TheoryConcepts.Ch3_LinearSearch;

public class Q1_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 22, 77, 14, 67, 43, 87};
        int target = 14;
        System.out.println("Element found at index No: " + linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
