package TheoryConcepts.Ch6_RecursionAndBacktracking.PatternQuestions;

public class ReverseTriangle {
    public static void main(String[] args) {
        printTriangle(4, 0);
    }

    static void printTriangle(int row, int col){
        if(row == 0){
            return;
        }

        if(col<row){
            System.out.print("*");
            printTriangle(row, col+1);
        }else {
            System.out.println();
            printTriangle(row-1, 0);
        }
    }
}
