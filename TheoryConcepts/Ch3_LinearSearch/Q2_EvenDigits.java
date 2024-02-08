package TheoryConcepts.Ch3_LinearSearch;

public class Q2_EvenDigits {
    public static void main(String[] args) {
        int[] arr = {18, 2, -1764, 9, 1, 234, 7891};
        System.out.println("Number of even digits are --> " + evenNumberDigits(arr));
    }

    static int evenNumberDigits(int[] arr){
        int count = 0;
        for(int digit : arr){
            boolean isEven = even(digit);
            if(isEven){
                count++;
            }
        }
        return count;
    }

    static boolean even(int digit){
        int numOfDigits = digits(digit);
        return numOfDigits % 2 == 0;
    }

    static int digits(int num){
        if(num < 0){
            num = num * (-1);
        }
        if(num == 0) return 1;

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
