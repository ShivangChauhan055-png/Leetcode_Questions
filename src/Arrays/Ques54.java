
import java.util.*;

/*
    Ques54.java
    Problem : Spiral Matrix

    Matrix ko spiral order me print karna hai.

    Example:
    Input matrix

        1 2 3
        4 5 6
        7 8 9

    Output:
        [1,2,3,6,9,8,7,4,5]

    Idea:
    4 boundaries maintain karte hain

        top
        bottom
        left
        right

    Aur 4 directions me traverse karte hain:
        1) Left → Right
        2) Top → Bottom
        3) Right → Left
        4) Bottom → Top
*/

public class Ques54 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> ans = spiralOrder(matrix);

        System.out.println(ans);
    }


    // =====================================
    // Spiral Traversal Function
    // =====================================

    public static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){

            // 1 Left → Right
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            // 2 Top → Bottom
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            // 3 Right → Left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // 4 Bottom → Top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}

