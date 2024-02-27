package ParikhJainDSASheet.BasicDSA.ArraysQuestion;

public class Q1_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 9, 7, 10, 10};
        System.out.println(findSecondLargest(arr.length, arr));
    }
    static int findSecondLargest(int n, int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLarge = largest;
        if(n<2){
            return -1;
        }

        for (int i=0; i<n; i++){
            if(arr[i] == largest){
                continue;
            }else if(arr[i]>largest){
                secondLarge = largest;
                largest = Math.max(largest, arr[i]);
            }else if(arr[i]>secondLarge){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
}
