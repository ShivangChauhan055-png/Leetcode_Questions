package Arrays;

import java.util.*;

class Ques238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        //  Step 1: suffix product (right side ka product)
        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            // right side ka product store kar diya
            ans[i] = suffix;
            // suffix update (current element include karke)
            suffix = suffix * nums[i];
        }
        //  Step 2: prefix product (left side ka product)
        int prefix = 1;
        for(int i = 0; i < n; i++){
            // prefix × suffix = final answer
            ans[i] = prefix * ans[i];
            // prefix update
            prefix = prefix * nums[i];
        }
        return ans;
    }
}
