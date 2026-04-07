package Binary_Search;

import java.util.*;

class Ques74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        // ================== APPROACH 1 ==================
        // BRUTE FORCE (O(n*m))
        // Har element check karenge
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
        // BINARY SEARCH (O(n log m))
        // Logic:
        // Har row ko treat karo sorted array ki tarah
        // Pehle check karo target us row ke range me aata hai ya nahi
        // Agar aata hai tabhi binary search lagao
        for(int i = 0; i < n; i++){
            // row ka size
            int rowSize = matrix[i].length;
            // check: kya target is row ke range me hai?
            if(matrix[i][0] <= target && target <= matrix[i][rowSize - 1]){
                // agar hai → binary search karo
                return bs(matrix[i], rowSize, target);
            }
        }
        return false;
    }
    // ================== BINARY SEARCH FUNCTION ==================
    public boolean bs(int[] arr, int n, int target){
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
