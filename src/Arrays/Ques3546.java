package Arrays;

import java.util.*;

class Ques3546 {

    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        //  har row aur column ka sum store karne ke liye
        int[] rowSum = new int[n];
        int[] colSum = new int[m];

        long total = 0;

        //  Step 1: total sum + rowSum + colSum calculate kar lo
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                total += grid[i][j];
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
            }
        }
        //  agar total odd hai → equal split possible nahi
        if(total % 2 == 1) return false;

        //  Step 2: Horizontal split check (upar vs niche)
        long upper = 0;
        for(int i = 0; i < n-1; i++){
            upper += rowSum[i];  // upar ka sum
            // niche ka sum = total - upper
            if(upper == total - upper){
                return true;
            }
        }

        //  Step 3: Vertical split check (left vs right)
        long left = 0;
        for(int j = 0; j < m-1; j++){
            left += colSum[j];  // left ka sum
            // right ka sum = total - left
            if(left == total - left){
                return true;
            }
        }
        return false;
    }
}
