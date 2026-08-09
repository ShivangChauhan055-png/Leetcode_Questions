package Arrays;

import java.util.*;
class Ques3731 {
    public List<Integer> findMissingElements(int[] nums) {
        // simple approach just put ele in set and find the range and check which one is not present
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = min ; i<=max;i++){
            if(!set.contains(i)) ls.add(i);
        }
        return ls;
    }
}
