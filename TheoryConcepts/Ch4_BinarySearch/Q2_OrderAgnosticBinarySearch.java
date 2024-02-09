package TheoryConcepts.Ch4_BinarySearch;

public class Q2_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arrAsc = {1, 2, 3, 4, 5, 9, 10, 27, 38, 45, 56, 67, 78, 89, 90};
        int[] arrDesc = {90, 89, 78, 67, 56, 45, 38, 27, 10, 9, 5, 4, 3, 2, 1};
        int target = 2;

        System.out.println("(Ascending)  Target find at index No.: "+ orderAgnosticBS(arrAsc, target));
        System.out.println("(Descending) Target find at index No.: "+ orderAgnosticBS(arrDesc, target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //Check the order is Ascending or Descending
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
