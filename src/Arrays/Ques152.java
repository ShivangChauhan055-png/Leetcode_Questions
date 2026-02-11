package Arrays;

import java.util.*;

public class Ques152 {

    // Same logic you wrote (Maximum Product Subarray)
    static class Solution {
        public int maxProduct(int[] nums) {

            int min = nums[0];
            int max = nums[0];
            int ans = nums[0];
            for (int i = 1; i < nums.length; i++) {
                // swap when negative
                if (nums[i] < 0) {
                    int temp = max;
                    max = min;
                    min = temp;
                }
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);

                ans = Math.max(ans, max);
            }
            return ans;
        }
    }
    // main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-2, 6, -3, -10, 0, 2};
        System.out.println("Maximum Product = " + sol.maxProduct(nums));
    }
}

