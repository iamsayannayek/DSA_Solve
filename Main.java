import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(solve("kxkszhk"));
//        3
//        g
//                kxkszhk
//        pphyki

    }
    static int solve(String s) {

        // Write your code here.
        int ansInc = incSlope(s);
        int ansDec = decSlope(s);
        int ans = 0;
        ans = Math.max(ansInc, ansDec);
        return ans;
    }

    static int incSlope(String s){
        int count = 0;
        int ans = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)<s.charAt(i+1)){
                count++;
                ans = count;
            }else{
                count = 0;
            }
        }
        return ans;
    }

    static int decSlope(String s){
        int count = 0;
        int ans = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)>s.charAt(i+1)){
                count++;
                ans = count;
            }else{
                count = 0;
            }
        }
        return ans;
    }
}