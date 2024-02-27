package ParikhJainDSASheet.BasicDSA.StringsQuestions;
import java.util.*;
public class Q1_ReverseStringWordWise {
    static String reverseStringWordWise(String input) {
        // Write your code here
        String[] words = input.trim().split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
            if(!words[i].isEmpty()){
                sb.append(words[i]);
                sb.append(" ");
            }
        }

        return sb.substring(0, sb.length()-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
