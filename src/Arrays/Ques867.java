package Arrays;

import java.util.*;
public class Ques867 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        // Transpose logic: swap rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print final transposed matrix
        System.out.println("Transposed Matrix:");
        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }
    }
}
