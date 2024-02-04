package Ch2_StringQs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q34_IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(integerToRoman(58));
    }

    static String integerToRoman(int num){
        int[] val =    {1000, 900, 500,  400, 100,  90,  50, 40,    10,   9,    5,   4,    1};
//        String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        List<String> sym = new ArrayList<>();
        sym.add("M");
        sym.add("CM");
        sym.add("D");
        sym.add("CD");
        sym.add("C");
        sym.add("XC");
        sym.add("L");
        sym.add("XL");
        sym.add("X");
        sym.add("IX");
        sym.add("V");
        sym.add("IV");
        sym.add("I");

        StringBuilder result = new StringBuilder();
        for (int i=0; i<13; i++){
            if (num==0) break;

            int times = num/val[i];
            while (times<0){
                result.append(sym.get(i));
                times--;
            }

            num = num%val[i];
        }
        return result.toString();
    }


}
