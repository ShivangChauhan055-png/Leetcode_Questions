package Math;

import java.util.*;
class Ques628 {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Math.max(nums[0]*nums[1]*nums[n-1] , nums[n-1]*nums[n-2]*nums[n-3]);
        return ans;
    }
}
