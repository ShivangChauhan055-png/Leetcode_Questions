package Arrays;

import java.util.*;

public class Ques229 {
    static class Solution {
        public List<Integer> majorityElement(int[] nums) {
            // Moore's Voting Algorithm use kar rahe hain
            // kyunki n/3 se zyada frequency wale max 2 elements hi ho sakte hain
            int c1 = 0, c2 = 0;                     // dono candidates ke counters
            int e1 = Integer.MIN_VALUE;             // candidate 1
            int e2 = Integer.MIN_VALUE;             // candidate 2
            // ---- PASS 1 ----
            // possible candidates find karte hain
            for(int i = 0; i < nums.length; i++){
                if(c1 == 0 && nums[i] != e2){
                    // agar counter 0 hai to new candidate le lo
                    e1 = nums[i];
                    c1 = 1;
                }
                else if(c2 == 0 && nums[i] != e1){
                    e2 = nums[i];
                    c2 = 1;
                }
                else if(nums[i] == e1){
                    c1++; // same element mila to counter badha diya
                }
                else if(nums[i] == e2){
                    c2++;
                }
                else{
                    // dono candidates se alag mila
                    // dono counters reduce kar do
                    c1--;
                    c2--;
                }
            }
            // ---- PASS 2 ----
            // verify karte hain ki actually frequency n/3 se zyada hai ya nahi
            c1 = 0;
            c2 = 0;
            for(int num : nums){
                if(num == e1) c1++;
                if(num == e2) c2++;
            }
            List<Integer> ans = new ArrayList<>();
            int mini = nums.length / 3 + 1;
            if(c1 >= mini) ans.add(e1);
            if(c2 >= mini && e1 != e2) ans.add(e2);
            return ans;
        }
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {3,2,3,2,2,1,1};
        List<Integer> res = obj.majorityElement(nums);
        System.out.println(res);
    }

}

