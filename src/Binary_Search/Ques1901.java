package Binary_Search;

import java.util.*;
class Ques1901 {
    // ye function kisi bhi column ka max element ka row index nikalta hai
    public int maxEle(int[][] mat, int col){
        int n = mat.length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < n; i++){
            if(mat[i][col] > max){
                max = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        // binary search on columns
        int low = 0, high = m - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            // mid column ka max element ka row
            int row = maxEle(mat, mid);
            // left aur right neighbor
            int left = (mid - 1 >= 0) ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = (mid + 1 < m) ? mat[row][mid + 1] : Integer.MIN_VALUE;
            // agar current element dono se bada hai → peak mil gaya
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row, mid};
            }
            // agar left bada hai → left side me peak milega
            else if(mat[row][mid] < left){
                high = mid - 1;
            }
            // warna right side me jao
            else{
                low = mid + 1;
            }
        }
        // agar kuch nahi mila
        return new int[]{-1, -1};
    }
}


