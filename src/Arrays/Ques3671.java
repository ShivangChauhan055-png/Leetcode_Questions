package Arrays;
import java.util.*;
class Ques3671 {
    public int minMirrorPairDistance(int[] nums) {
        // hashmap: reverse number → index
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        // array traverse karo
        for(int i = 0; i < nums.length; i++){
            // agar current number pehle kisi reverse ke form me aaya hai
            if(map.containsKey(nums[i])){
                ans = Math.min(ans, Math.abs(i - map.get(nums[i])));
            }
            // current number ka reverse store karo
            map.put(reverse(nums[i]), i);
        }
        // agar koi pair nahi mila
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    // number reverse function
    public int reverse(int x){
        int rev = 0;
        while(x > 0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }
}


