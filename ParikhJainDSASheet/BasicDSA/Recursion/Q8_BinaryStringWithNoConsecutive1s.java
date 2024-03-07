package ParikhJainDSASheet.BasicDSA.Recursion;

import java.util.List;
import java.util.ArrayList;

public class Q8_BinaryStringWithNoConsecutive1s {
    public static void main(String[] args) {
        System.out.println(generateString(3));
    }

    public static List< String > generateString(int N) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        solve(N, ans, 0, "", false);
        return ans;
    }

    public static void solve(int n, List<String> ans, int index, String temp, boolean flag){
        if(index==n){
            ans.add(temp);
            return;
        }

        if(!flag){
            solve(n, ans, index+1, temp+"0", false);
            solve(n, ans, index+1, temp+"1", true);
        }else{
            solve(n, ans, index+1, temp+"0", false);
        }
    }
}
