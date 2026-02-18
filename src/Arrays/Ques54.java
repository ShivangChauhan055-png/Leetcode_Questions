package Arrays;

import java.util.*;

public class Ques54 {

    public static void main(String[] args) {

        // Example matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Soluti obj = new Soluti();
        List<Integer> ans = obj.spiralOrder(matrix);

        System.out.println(ans);
    }
}

class Soluti {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Result store karne ke liye list
        List<Integer> result = new ArrayList<>();
        // 4 boundaries define karte hain
        int top = 0;                         // sabse upar wali row
        int bottom = matrix.length - 1;      // sabse neeche wali row
        int left = 0;                        // sabse left column
        int right = matrix[0].length - 1;    // sabse right column
        // Jab tak boundaries cross nahi hoti
        while (top <= bottom && left <= right) {
            // 1 Left se Right (Top row)
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;  // top row complete ho gayi, neeche shift karo
            // 2 Top se Bottom (Right column)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;  // right column complete ho gaya

            // 3 Right se Left (Bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;  // bottom row complete
            }

            // 4 Bottom se Top (Left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;  // left column complete
            }
        }
        return result;
    }
}

