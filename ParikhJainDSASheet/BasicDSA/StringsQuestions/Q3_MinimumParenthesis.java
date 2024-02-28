package ParikhJainDSASheet.BasicDSA.StringsQuestions;

public class Q3_MinimumParenthesis {
    public static void main(String[] args) {
        String s = ")((()";
        System.out.println(minimumParentheses(s));
    }

    public static int minimumParentheses(String s) {
        // Write your code here.
        int open = 0;
        int close = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }else{
                if(open == 0){
                    close++;
                }else{
                    open--;
                }
            }
        }
        return (open + close);
    }
}
