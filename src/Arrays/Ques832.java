package Arrays;

import java.util.*;
public class Ques832 {
    public static void main(String[] args) {
            int[][] A = {
                    {1, 1, 0},
                    {1, 0, 1},
                    {0, 0, 0}
            };

            // Flip each row (reverse)
            for (int[] row : A) {
                int left = 0, right = row.length - 1;
                while (left < right) {
                    int temp = row[left];
                    row[left] = row[right];
                    row[right] = temp;
                    left++;
                    right--;
                }
            }

            // Invert each bit (0 -> 1, 1 -> 0)
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
                }
            }

            // Print final result
            for (int[] row : A) {
                System.out.println(Arrays.toString(row));
            }
    }
}
