package ParikhJainDSASheet.BasicDSA.ArraysQuestion;

public class Q4_EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 3, 2};
        System.out.println(arrayEquilibriumIndex(arr));
    }

    static int arrayEquilibriumIndex(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            sum -= arr[i];
            if(leftSum == sum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
