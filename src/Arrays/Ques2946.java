package Arrays;

import java.util.*;

/*
    Ques2946.java
    Problem : Check if matrix rows are similar after shifts
    Idea:
    Har row ke liye check karna hai:
     Even row (0,2,4...)
        → LEFT shift by k

     Odd row (1,3,5...)
        → RIGHT shift by k

    Aur dekhna hai ki shifting ke baad bhi row same hai ya nahi

    --------------------------------------------------
    Formula:
    LEFT shift:
        new position j = (j + k) % m
    RIGHT shift:
        new position j = (j - k + m) % m

    --------------------------------------------------
*/

public class Ques2946 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {4,1,2,3},
                {1,2,3,4}
        };
        int k = 1;
        System.out.println(areSimilar(mat, k));
    }
    // ======================================
    // Main Logic
    // ======================================
    public static boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        // agar k bada hai to modulo le lo
        k = k % m;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // EVEN ROW → LEFT SHIFT
                if(i % 2 == 0){
                    if(mat[i][j] != mat[i][(j + k) % m]){
                        return false;
                    }
                }
                // ODD ROW → RIGHT SHIFT
                else{
                    if(mat[i][j] != mat[i][(j - k + m) % m]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

