package Arrays;

import java.util.*;
public class Ques66 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int n = digits.length;

        // Step 1: Traverse from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;      // agar 9 se less than hoga to plus one krke return kr dega
                System.out.println("Output: " + Arrays.toString(digits));
                return;
            }
            digits[i] = 0; // agr 9 hoga to uss jgh 0 aaega carry agge chali jaegi
        }

        // Step 2: If all digits were 9 → create new array
        int[] result = new int[n + 1];
        result[0] = 1;

        System.out.println("Output: " + Arrays.toString(result));
    }
}
