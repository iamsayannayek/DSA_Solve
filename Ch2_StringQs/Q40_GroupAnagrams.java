package Ch2_StringQs;

import java.util.*;

public class Q40_GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    //Method 1: Calculate group of anagrams by frequency check
    static List<List<String>> groupAnagrams(String[] strs){
        //Check for empty input
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> frequencyStringsMap = new HashMap<>();
        for(String str : strs){
            String frequencyString = getFrequencyString(str);
            if(frequencyStringsMap.containsKey(frequencyString)){
                frequencyStringsMap.get(frequencyString).add(str);
            }else{
                List<String> strsList = new ArrayList<>();
                strsList.add(str);
                frequencyStringsMap.put(frequencyString, strsList);
            }
        }
        return new ArrayList<>(frequencyStringsMap.values());
    }

    static String getFrequencyString(String str){
        //Frequency Bucket
        int[] freq = new int[26];

        //Iterate over each character
        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for (int i : freq){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }

    //Method 2: By Using Sorting
    public List<List<String>> groupAnagramsBySorting(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] tmp = str.toCharArray();
            Arrays.sort(tmp);
            String key = new String(tmp);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

//        List<List<String>> result = new ArrayList<>();
//        for ( List<String> l: map.values()) {
//            result.add(l);
//        }
        return new ArrayList<>(map.values());
    }
}
