package TheoryConcepts.Ch3_LinearSearch;

public class Q3_MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for(int[] i : accounts){
            int wealth = 0;
            for(int j : i){
                wealth += j;
            }
            if(wealth > ans){
                ans = wealth;
            }
        }
        return ans;
    }
}
