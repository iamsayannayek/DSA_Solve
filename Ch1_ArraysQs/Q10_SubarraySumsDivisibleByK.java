package Ch1_ArraysQs;

import java.util.HashMap;

public class Q10_SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int count = subarraysDivByK(arr, 5);
        System.out.println(count);
    }
    //Optimal Approach Using HashMap, TC:O(n), SC:O(n)
    static int subarraysDivByK(int[] arr, int k){
        int count = 0; //Count number of Subarrays sum divisible by K
        int sum = 0; //Sum the element of subarrays

        //Create HasMap for track the remainder and remainder count
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);//Initialize the first value 0 , 1 because 0 % 7 = 0 then 0 => 1

        for(int i : arr){
            sum += i;
            int rem = sum%k; //Define the reminder of sum % k

            //If there was any negative value then {rem + k} for don't avoid the previous sum who is divisible by k
            if(rem < 0){
                rem += k;
            }

            //If the remainder is occurred before then check it is in Map or not
            //If it's in Map then increase the remainder count by 1
            //If it's not then put the value into Map
            if(map.containsKey(rem)){
                count += map.get(rem); //Subarrays sum % k count increase
                map.put(rem , map.get(rem) + 1);
            }else{
                map.put(rem, 1);
            }
        }
        return count;
    }
    //Better Approach, TC: O(n^2), SC: O(1)
    static int betterOne(int[] arr, int k){
        int count = 0;
        // Cumulative Sum of the Array
        for(int i=1; i<arr.length; i++){//TC: O(n)
            arr[i] += arr[i-1];
        }
        for(int i=0; i< arr.length; i++){//TC: O(n)
            for(int j=i; j< arr.length; j++){ //TC: O(n)
                int sum = (i==0) ? arr[j] : (arr[j]-arr[i-1]); //TC: O(1)
                if(sum%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    //Brute Force Approach T.C: O(n^3), S.C: O(1)
    static int bruteForce(int[] arr, int k){
        int count = 0;
        int sum = 0;
        for(int i=0; i< arr.length; i++){//TC: O(n)
            for(int j=i; j< arr.length; j++){//TC: O(n)
                int start = i;
                while (start<=j){//TC: O(n)
                    sum += arr[start];
                    start++;
                }
                if(sum%k == 0){
                    count++;
                }
                sum = 0;
            }
        }
        return count;
    }
}
