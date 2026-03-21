package Arrays;
import java.util.*;
/*
    Ques3643.java
    Reverse Submatrix (Single class version)

    Idea:
    top row ↔ bottom row swap karte hain
*/

public class Ques3643 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int x = 0, y = 0, k = 3;
        reverseSubmatrix(grid, x, y, k);
        // print result
        for(int[] row : grid){
            System.out.println(Arrays.toString(row));
        }
    }

    // main logic
    public static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int startRow = x, endRow = x + k - 1;
        int startCol = y, endCol = y + k - 1;

        // jab tak rows cross nahi hoti
        while(startRow < endRow){
            for(int j = startCol; j <= endCol; j++){
                swap(grid, startRow, j, endRow, j);
            }
            startRow++;
            endRow--;
        }
        return grid;
    }

    // swap function
    public static void swap(int[][] grid, int r1, int c1, int r2, int c2){
        int temp = grid[r1][c1];
        grid[r1][c1] = grid[r2][c2];
        grid[r2][c2] = temp;
    }
}


