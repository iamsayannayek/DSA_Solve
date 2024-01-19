package Ch1_ArraysQs;

import java.util.Arrays;

public class Q24_GameOfLife {
    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        System.out.println("Input: ");
        for (int[] element : board) {
            System.out.println(Arrays.toString(element));
        }
        gameOfLife(board);
        System.out.println("Output: ");
        for (int[] element : board) {
            System.out.println(Arrays.toString(element));
        }
    }

    static void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int live = 0;

                //Check 1: North-West (i-1) & (j-1)
                if(i-1>=0 && j-1>=0 && Math.abs(board[i-1][j-1]) == 1){
                    live++;
                }

                //Check 2: North (i-1) & j
                if(i-1>=0 && Math.abs(board[i-1][j]) == 1){
                    live++;
                }

                //Check 3: North-East (i-1)(j+1)
                if (i-1>=0 && j+1<m && Math.abs(board[i-1][j+1]) == 1) live++;

                //Check 4: West (j-1)
                if(j-1>=0 && Math.abs(board[i][j-1]) == 1) live++;

                //Check 5: East (j+1)
                if(j+1<m && Math.abs(board[i][j+1]) == 1) live++;

                //Check 6: South-West (i+1)(j-1)
                if (i+1<n && j-1>=0 && Math.abs(board[i+1][j-1]) == 1) live++;

                //Check 7: South (i+1) j
                if(i+1<n && Math.abs(board[i+1][j]) == 1) live++;

                //Check 8: South-East (i+1)(j+1)
                if(i+1<n && j+1<m && Math.abs(board[i+1][j+1]) == 1) live++;

/*
1. Any live cell with fewer than two live neighbors dies as if caused by under-population.
2. Any live cell with two or three live neighbors lives on to the next generation.
3. Any live cell with more than three live neighbors dies, as if by over-population.
4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
*/
                //Now Mark the 0->1 => -2 & 1->0 => -1
                //For Checking live shells neighbour
                if(board[i][j]==1){
                    if(live<2 || live>3){
                        board[i][j] = -1; //Means 0; live cell with fewer than 2 live neighbors dies
                    }
                } else if (board[i][j] == 0 && live==3) {
                    board[i][j] = -2;//Means 1, dead cell with exactly three live neighbors becomes a live cell
                }

            }
        }

        //Now Turns all the -1 & -2 value to the actual value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == -1){
                    board[i][j] = 0;
                } else if (board[i][j] == -2) {
                    board[i][j] = 1;
                }
            }
        }
    }

}
