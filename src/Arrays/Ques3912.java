package Arrays;

import java.util.*;

public class Ques3912 {
    public static List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ls = new ArrayList<>();
        if (n == 1) {
            ls.add(nums[0]);
            return ls;
        }
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        // prefix[i] = left side ka max
        prefix[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], nums[i - 1]);
        }
        // suffix[i] = right side ka max
        suffix[n - 1] = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], nums[i + 1]);
        }
        // check condition
        for (int i = 0; i < n; i++) {
            // edge elements always valid
            if (i == 0 || i == n - 1) {
                ls.add(nums[i]);
            }
            // main logic
            else if (prefix[i] < nums[i] || suffix[i] < nums[i]) {
                ls.add(nums[i]);
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 4, 6};
        System.out.println(findValidElements(nums));
    }
}
