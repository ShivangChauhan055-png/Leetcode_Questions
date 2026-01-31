package Arrays;

import java.util.HashMap;

public class Ques560 {

    // LeetCode 560: Subarray Sum Equals K
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // base case
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    // main method to RUN
    public static void main(String[] args) {

        Ques560 obj = new Ques560();

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = obj.subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + result);
    }
}

