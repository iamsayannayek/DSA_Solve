package Ch3_SearchingSortingQs;

import java.util.Arrays;

public class Q68_FindingPairWithGivenDifference {
    public static void main(String[] args) {
        int arr[] = { 100, 8, 30, 40, 10 };
        int size = arr.length;
        int n = 10;
        System.out.println();
        System.out.println(findPair(arr, size, n));
    }

    static boolean findPair(int[] arr, int size, int n) {
        //code here.
        Arrays.sort(arr);
        int l = 0;
        int r = 1;
        n = Math.abs(n);
        while(l<=r && r<size){
            int diff = arr[r] - arr[l];
            if(diff == n && l!=r){
                System.out.println("Pair found is: " + arr[l] + "," + arr[r]);
                return true;
            } else if (diff > n) {
                l++;
            }else{
                r++;
            }
        }
        System.out.println("Pair does not exist");
        return false;
    }
}
