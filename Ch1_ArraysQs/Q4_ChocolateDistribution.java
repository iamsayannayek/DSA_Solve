package Ch1_ArraysQs;
//Question Link: https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
import java.util.Arrays;

public class Q4_ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        int ans = findMinDiff(arr, m);
        System.out.println(ans);
    }

    static int findMinDiff(int[] arr, int m){
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<= arr.length-m; i++){
            int minWindow = arr[i];
            int maxWindow = arr[i+m-1];
            int gap = maxWindow - minWindow;
            if(gap<ans){
                ans = gap;
            }
        }
        return ans;
    }
}
