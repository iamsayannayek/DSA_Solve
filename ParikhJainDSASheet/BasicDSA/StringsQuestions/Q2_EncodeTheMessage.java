package ParikhJainDSASheet.BasicDSA.StringsQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q2_EncodeTheMessage {
    public static void main(String[] args) {
        String str = "aassdsad";
        System.out.println(encode(str));
    }

    public static String encode(String message) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();

        int count = 1;
        char ch = message.charAt(0);
        for(int i=1; i<message.length(); i++){
            char ch1 = message.charAt(i);
            if(ch == ch1){
                count++;
            }else{
                sb.append(ch);
                sb.append(count);
                count = 1;
            }
            ch = ch1;
        }

        if(count>=1){
            sb.append(message.charAt(message.length()-1));
            sb.append(count);
        }
        return sb.toString();
    }
}
