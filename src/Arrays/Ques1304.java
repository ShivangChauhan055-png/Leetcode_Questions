package Arrays;

import java.util.*;
public class Ques1304 {
    public static void main(String[] args) {
        int n = 5;
        int[] result = sumZero(n);
        System.out.println("Array of " + n + " numbers that sum to zero: " + Arrays.toString(result));
    }

    public static int[] sumZero(int n) {
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            // If n is odd, and it's the middle element → put 0
            // Else → fill positive numbers on left, negative on right
            x[i] = ((n % 2 == 1) && i == n / 2) ? 0 : (i < n / 2 ? i + 1 : -(n - i));
        }

        return x;
    }
}
