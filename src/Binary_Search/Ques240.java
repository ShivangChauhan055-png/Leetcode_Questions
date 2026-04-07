package Binary_Search;

import java.util.*;

class Ques240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        // ================== APPROACH 1 ==================
        // BRUTE FORCE (O(n * m))
        // Logic:
        // Har element check karenge
        // Mil gaya → true
        // Nahi mila → false
        /*
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
        */

        // ================== APPROACH 2 ==================
        // OPTIMAL (O(n + m))
        // Logic (VERY IMPORTANT):
        // Top-right corner se start karo
        // Kyunki:
        // left side chhota hota hai
        // niche bada hota hai
        int row = 0;
        int col = m - 1;
        while(row < n && col >= 0){
            // agar mil gaya
            if(matrix[row][col] == target){
                return true;
            }
            // agar current chhota hai → niche jao (bada milega)
            else if(matrix[row][col] < target){
                row++;
            }
            // agar current bada hai → left jao (chhota milega)
            else{
                col--;
            }
        }
        return false;
    }
}
