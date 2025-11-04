package Arrays;

import java.util.*;
public class Ques1480 {
    public static void main(String[] args) {
        int[] nums = {1, 3,4,5};
        int n = nums.length;

        int[] runningSum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            runningSum[i] = sum;
        }

        System.out.println("Running Sum of Array: " + Arrays.toString(runningSum));
    }
}
