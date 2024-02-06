package Ch2_StringQs;

import java.util.ArrayList;
import java.util.List;

public class Q47_BoyerMooreAlgoForPatternSearch {
    public static void main(String[] args) {
        String txt = "AABAACAADAABAABA";
        String pat = "AABA";
        System.out.println(patternSearch(txt, pat));
    }

    static List<Integer> patternSearch(String txt, String pat){
        int m = txt.length();
        int n = pat.length();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((i+j)<m && txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
                if(j == (n-1)){
                    list.add(i);
                }
            }
        }
        return list;
    }
}
