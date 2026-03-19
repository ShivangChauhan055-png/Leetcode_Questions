package Arrays;

import java.util.*;

class Ques3212 {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        // ye arrays har column tak X aur Y ki total frequency store karenge
        int[] preX = new int[m];
        int[] preY = new int[m];
        int count = 0;
        for(int i = 0; i < n; i++){
            int x = 0, y = 0; // current row ka prefix count
            for(int j = 0; j < m; j++){
                // current row me prefix bana rahe hain
                if(grid[i][j] == 'X') x++;
                else if(grid[i][j] == 'Y') y++;
                // ab column-wise total me add kar diya
                preX[j] += x;
                preY[j] += y;
                // condition check:
                // X aur Y equal ho aur atleast ek X ho
                if(preX[j] > 0 && preX[j] == preY[j]) count++;
            }
        }
        return count;
    }
}
