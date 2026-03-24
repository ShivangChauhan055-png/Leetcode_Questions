package Arrays;

import java.util.*;

class Ques2906 {
    public int[][] constructProductMatrix(int[][] grid) {
        // idea:
        // har cell ke liye → baaki sab elements ka product chahiye
        // direct multiply karoge → O(n² * n²)
        // isliye prefix + suffix use karenge
        long mod = 12345;
        int n = grid.length, m = grid[0].length;
        int[][] ans = new int[n][m];
        // Step 1: suffix product (right se left, bottom se top)
        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                // abhi tak ka suffix store kar diya
                ans[i][j] = (int) suffix;
                // suffix update kar diya (current element include karke)
                suffix = (suffix * grid[i][j]) % mod;
            }
        }
        // Step 2: prefix product (left se right, top se bottom)
        long prefix = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // prefix × suffix = answer
                ans[i][j] = (int) ((prefix * ans[i][j]) % mod);

                // prefix update
                prefix = (prefix * grid[i][j]) % mod;
            }
        }
        return ans;
    }
}
