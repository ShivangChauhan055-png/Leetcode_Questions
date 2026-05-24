package Arrays;

import java.util.*;
class Ques3940 {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]) count = 1;
            else count++;
            if(count<=k) ls.add(nums[i]);
        }
        int[] ans = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}
