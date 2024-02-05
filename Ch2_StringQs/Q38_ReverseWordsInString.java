package Ch2_StringQs;

public class Q38_ReverseWordsInString {
    public static void main(String[] args) {
        String str = " the sky is blue ";
        System.out.println(reverseWords(str));

    }
    static String reverseWords(String s){
        String[] words = s.trim().split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
            if(!words[i].isEmpty()){
                sb.append(words[i]);
                sb.append(" ");
            }
        }

        return sb.substring(0, sb.length()-1);
    }
}
