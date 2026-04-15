package Arrays;
import java.util.*;
class Ques287 {
    public int findDuplicate(int[] nums) {
        // approach 1 using HashSet tc -->O(n)
        // HashSet<Integer> s = new HashSet<>();
        // for(int n : nums){
        //     if(s.contains(n)) return n;
        //     s.add(n);
        // }
        // return -1;

        // approach 2 using Sorting tc --> O(nlogn)
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]) return nums[i];
        }
        return -1;
    }
}
