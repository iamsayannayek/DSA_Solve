package A2Z_DSASheet.Ch1_ArraysQs.EasyQs;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,4};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr){
        int value = 0;
        for(int num: arr){
            value ^= num;
        }

        return value;
    }
}
