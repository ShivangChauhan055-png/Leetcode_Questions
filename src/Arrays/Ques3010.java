package Arrays;

import java.util.Arrays;

public class Ques3010 {

    /*
     * LeetCode 3010: Divide an Array Into Subarrays With Minimum Cost I
     *
     * Problem idea:
     * - nums[0] is mandatory
     * - remaining nums[1..n-1] me se 2 smallest elements lene hain
     * - answer = nums[0] + smallest1 + smallest2
     */

    // ---------------- APPROACH 1 ----------------
    // Sorting approach
    // Time: O(n log n), Space: O(1)
    public static int minimumCostUsingSort(int[] nums) {

        int first = nums[0]; // fixed element

        // sort only from index 1 to end
        Arrays.sort(nums, 1, nums.length);

        // pick two smallest after sorting
        return first + nums[1] + nums[2];
    }

    // ---------------- APPROACH 2 ----------------
    // Optimized approach (without sorting)
    // Time: O(n), Space: O(1)
    public static int minimumCostOptimized(int[] nums) {

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // start from index 1 because nums[0] is fixed
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }

        return nums[0] + firstMin + secondMin;
    }

    // ---------------- MAIN METHOD ----------------
    // IntelliJ se RUN karne ke liye
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        System.out.println("Using Sorting Approach: "
                + minimumCostUsingSort(nums.clone()));

        System.out.println("Using Optimized Approach: "
                + minimumCostOptimized(nums));
    }
}

