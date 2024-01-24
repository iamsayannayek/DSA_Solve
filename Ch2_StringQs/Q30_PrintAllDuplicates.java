package Ch2_StringQs;

import java.util.HashMap;
import java.util.Map;

public class Q30_PrintAllDuplicates {
    public static void main(String[] args) {
        String str = "test string";
        printDuplicates(str);
    }
    static void printDuplicates(String str){
        Map<Character, Integer> charOccurrence = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(charOccurrence.containsKey(str.charAt(i))){
                charOccurrence.put(str.charAt(i), charOccurrence.get(str.charAt(i))+1);
            }else {
                charOccurrence.put(str.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> mapElement : charOccurrence.entrySet()){
            if(mapElement.getValue()>1){
                System.out.println(mapElement.getKey() + ", count= " + mapElement.getValue());
            }
        }
    }

}
