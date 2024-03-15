package TCS_NQT.Pr1_Arrays;

public class Q7_SumOfAllElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,5,1};
        System.out.println(sumOfAllElement(arr));
    }
    static int sumOfAllElement(int[] arr){
        int sum = 0;
        for (int i: arr){
            sum += i;
        }
        return sum;
    }
}
