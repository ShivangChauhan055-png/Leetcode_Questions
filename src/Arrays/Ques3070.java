package Arrays;

// Ques3070.java
// Problem: Count Submatrices With Sum <= k (Top-left fixed at (0,0))

/*
Idea simple hai bhai:

Brute force me hum har (0,0) → (i,j) ka sum nikal rahe the
aur har baar pura rectangle dobara traverse kar rahe the

Isko optimize karne ke liye hum use karte hain:
---> 2D Prefix Sum

-------------------------------------

Prefix ka matlab:

mat[i][j] = (0,0) se (i,j) tak ka total sum

Formula:

mat[i][j] = grid[i][j]
          + mat[i-1][j]   (upar ka sum)
          + mat[i][j-1]   (left ka sum)
          - mat[i-1][j-1] (double count hatao)

-------------------------------------

Phir har cell pe:

agar mat[i][j] <= k
toh wo submatrix valid hai

-------------------------------------

Time Complexity:
O(n * m)

Space:
O(n * m)
*/

class Ques3070 {

    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int count = 0;
        // prefix matrix
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // base value
                mat[i][j] = grid[i][j];
                // upar ka sum add
                if(i > 0) mat[i][j] += mat[i-1][j];
                // left ka sum add
                if(j > 0) mat[i][j] += mat[i][j-1];
                // double count hatao
                if(i > 0 && j > 0) mat[i][j] -= mat[i-1][j-1];
                // check condition
                if(mat[i][j] <= k) count++;
            }
        }
        return count;
    }
}
