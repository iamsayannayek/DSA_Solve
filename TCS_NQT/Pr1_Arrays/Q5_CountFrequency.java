package TCS_NQT.Pr1_Arrays;

import java.util.HashMap;
import java.util.Map;

public class Q5_CountFrequency {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        countFrequency(arr);
    }

    static void countFrequency(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-->"+ entry.getValue());
        }

    }
}
