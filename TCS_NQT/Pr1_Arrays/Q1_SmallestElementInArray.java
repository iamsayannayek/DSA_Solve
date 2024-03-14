package TCS_NQT.Pr1_Arrays;

public class Q1_SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};
        System.out.println(findSmallest(arr));
    }

    static int findSmallest(int[] arr){
        int small = arr[0];
        for (int i:arr){
            if(i<small){
                small = i;
            }
        }
        return small;
    }
}
