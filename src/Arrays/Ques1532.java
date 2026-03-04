package Arrays;

// Ques1532.java
import java.util.*;

public class Ques1532 {
    static class Solution {
        public int numSpecial(int[][] mat) {
            int n = mat.length, m = mat[0].length;
            int[] row = new int[n];
            int[] col = new int[m];
            // Count 1s in each row and column
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == 1) {
                        row[i]++;
                        col[j]++;
                    }
                }
            }
            int ans = 0;
            // Check special positions
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                        ans++;
                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] mat = {
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };
        int result = sol.numSpecial(mat);
        System.out.println("Number of Special Positions: " + result);
    }
}
