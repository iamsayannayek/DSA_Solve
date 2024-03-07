package ParikhJainDSASheet.BasicDSA.Recursion;

public class Q3_PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("babb"));
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        int s = 0;
        int end = str.length()-1;
        return palindrome(str, s, end);

    }

    static boolean palindrome(String str, int s, int e){
        if(s>=e){
            return true;
        }
        return (str.charAt(s)==str.charAt(e))&&palindrome(str, s+1, e-1);
    }
}
