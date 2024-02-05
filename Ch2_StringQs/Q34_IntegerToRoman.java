package Ch2_StringQs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q34_IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(integerToRoman(1994));
    }

    static String integerToRoman(int num){
        StringBuilder sb = new StringBuilder();
        process(sb, '*', 'M', '*', num/1000);
        num = num%1000;
        process(sb, 'M', 'C', 'D', num/100);
        num = num%100;
        process(sb, 'C', 'X', 'L', num/10);
        num = num%10;
        process(sb, 'X', 'I', 'V', num);

        return sb.toString();
    }

    static void process(StringBuilder sb, char major, char minor, char middle, int val){
        if(val <= 3){
            for(int i=1; i<=val; i++){
                sb.append(minor);
            }
        }else if(val == 4){
            sb.append(minor);
            sb.append(middle);
        } else if (val == 5) {
            sb.append(middle);
        } else if (val<=8) {
            sb.append(middle);
            for (int i=6; i<=val; i++){
                sb.append(minor);
            }
        }else if(val == 9){
            sb.append(minor);
            sb.append(major);
        }
    }

}
