package Ch1_ArraysQs;
//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Q3_BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println("Maximum Profit: " + profit);
    }

    static int maxProfit(int[] arr){
        int mProfit = 0;
        int minSoFar = arr[0];
        for (int price : arr) {
            minSoFar = Math.min(price, minSoFar);
            int profit = price - minSoFar;
            mProfit = Math.max(mProfit, profit);
        }
        return mProfit;
    }
}
