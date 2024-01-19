package Ch1_ArraysQs;


import java.util.ArrayList;
import java.util.List;

public class Q17_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> ans = new ArrayList<>();
        ans = spiralOrder(matrix);
        System.out.println(ans);

    }

    static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int buttom = n - 1;

        //Answer store
        List<Integer> ans = new ArrayList<>();

        while(top<=buttom && left<=right){
            //left --> right
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //top --> buttom
            for(int i=top; i<=buttom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //right --> left
            if(top<=buttom){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[buttom][i]);
                }
                buttom--;
            }

            //buttom --> top
            if(left<=right){
                for(int i=buttom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
