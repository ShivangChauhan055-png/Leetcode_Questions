package Arrays;

// Ques128.java
// LeetCode 128 - Longest Consecutive Sequence

import java.util.HashSet;
class Ques128 {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int ans = 1;
        // HashSet banaya taaki fast lookup mile
        HashSet<Integer> set = new HashSet<>();
        // saare elements set me daal diye
        for(int a : nums){
            set.add(a);
        }
        // ab directly set pe loop (duplicates already removed)
        for(int it : set){
            // sirf wahi element se start karo jiska previous exist nahi karta
            if(!set.contains(it - 1)){
                int count = 1;
                int x = it;
                // aage continuous numbers mil rahe hain ya nahi check karo
                while(set.contains(x + 1)){
                    count++;
                    x++;
                }
                // max update karo
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
