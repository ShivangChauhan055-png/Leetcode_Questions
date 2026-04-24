package Arrays;

import java.util.*;

// LeetCode 2615: Sum of Distances
public class Ques2615 {
    //  BRUTE FORCE APPROACH
    // TC: O(n^2), SC: O(1)
    // Har index ke liye sab indices check karke distance nikalte hain
    public static long[] bruteForce(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j] && i != j) {
                    sum += Math.abs(i - j);
                }
            }
            ans[i] = sum;
        }
        return ans;
    }

    //  OPTIMIZED APPROACH (Prefix Sum + HashMap)
    // TC: O(n), SC: O(n)
    public static long[] optimized(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        // freq -> count of occurrences
        // indexSum -> sum of indices
        HashMap<Integer, Long> freq = new HashMap<>();
        HashMap<Integer, Long> indexSum = new HashMap<>();

        //  LEFT TO RIGHT PASS
        for (int i = 0; i < n; i++) {
            long f = freq.getOrDefault(nums[i], 0L);
            long sum = indexSum.getOrDefault(nums[i], 0L);
            // Left contribution
            ans[i] += f * i - sum;
            // update maps
            freq.put(nums[i], f + 1);
            indexSum.put(nums[i], sum + i);
        }
        // reset maps
        freq.clear();
        indexSum.clear();
        //  RIGHT TO LEFT PASS
        for (int i = n - 1; i >= 0; i--) {
            long f = freq.getOrDefault(nums[i], 0L);
            long sum = indexSum.getOrDefault(nums[i], 0L);
            // Right contribution
            ans[i] += sum - f * i;
            // update maps
            freq.put(nums[i], f + 1);
            indexSum.put(nums[i], sum + i);
        }
        return ans;
    }

    //  MAIN FUNCTION (Testing)
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 1, 2};
        System.out.println("Brute Force:");
        System.out.println(Arrays.toString(bruteForce(nums)));
        System.out.println("Optimized:");
        System.out.println(Arrays.toString(optimized(nums)));
    }
}