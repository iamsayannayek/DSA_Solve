package Ch2_StringQs;

public class Q33_ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
    static boolean validPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left<right){
            if(s.charAt(left)==s.charAt(right)){ // Last Character & first Character same then continue the iteration
                left++;
                right--;
            }else{
                //If there is any character occurred in left or right position then check by skipping one char from
                //left or right
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
            }
        }
        return true;
    }

    static boolean isPalindrome(String s, int left, int right){
        while (left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
