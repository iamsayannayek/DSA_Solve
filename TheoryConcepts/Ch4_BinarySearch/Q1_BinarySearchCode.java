package TheoryConcepts.Ch4_BinarySearch;

public class Q1_BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 10, 27, 38, 45, 56, 67, 78, 89, 90};
        int target = 2;
        System.out.println("The index is founded at: "+binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
