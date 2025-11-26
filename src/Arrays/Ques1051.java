package Arrays;

import java.util.*;
public class Ques1051 {
    public static int heightChecker(int[] heights) {
        int[] expected = heights.clone();  // ye .clone() array ki exact copy bna dega
        Arrays.sort(expected);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }
}

