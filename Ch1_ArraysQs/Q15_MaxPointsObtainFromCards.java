package Ch1_ArraysQs;

public class Q15_MaxPointsObtainFromCards {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        int maxPoints = maxScore(arr, k);
        System.out.println(maxPoints);
    }

    static int maxScore(int[] cardPoints, int k) {
        int sumOfkEls = 0;
        for(int i=0; i<k; i++){
            sumOfkEls += cardPoints[i];
        }

        int len = cardPoints.length;
        int maxSum = sumOfkEls;

        int i=0;
        while(i<k){
        //  sumOfkEls = sumOfkEls -    leftPointer    +     rightPointer
            sumOfkEls = sumOfkEls - cardPoints[k-i-1] + cardPoints[len-1-i];
            maxSum = Math.max(maxSum, sumOfkEls);
            i++;
        }
        return maxSum;
    }
}
