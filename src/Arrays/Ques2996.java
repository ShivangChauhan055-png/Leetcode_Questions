package Arrays;
import java.util.*;
class Ques2996 {
    public int missingInteger(int[] nums) {
        // tc-->O(n) && sc-->O(n)
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum +=nums[i];
            else break;
        }
        HashSet<Integer> s = new HashSet<>();
        for(int x : nums) s.add(x);
        while(s.contains(sum)) sum++;
        return sum;
    }
}
