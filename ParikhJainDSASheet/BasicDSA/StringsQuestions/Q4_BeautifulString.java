package ParikhJainDSASheet.BasicDSA.StringsQuestions;

public class Q4_BeautifulString {
    public static void main(String[] args) {

    }

    public static int makeBeautiful(String str) {
        int n = str.length();
        String g1 = generatedStr(n, true);
        int diff1 = change(str, g1, n);

        String g2 = generatedStr(n, false);
        int diff2 = change(str, g2, n);

        int min = Math.min(diff1, diff2);

        return min;
    }

    static String generatedStr(int n, boolean zero){
        String ans = "";
        if(zero){
            ans += "0";
            n--;
        }else{
            ans += "1";
            n--;
        }

        while(n!=0){
            // String temp = (ans.charAt(ans.length()-1) == "0") ? "1" : "0";
            if(ans.charAt(ans.length()-1)== '0'){
                ans += "1";
            }else{
                ans += "0";
            }
            // ans += temp;
            n--;
        }
        return ans;
    }

    static int change(String str, String g, int n){
        int ans = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)!=g.charAt(i)){
                ans++;
            }
        }
        return ans;
    }
}
