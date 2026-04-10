package Arrays;
// Ques3740.java
import java.util.*;
class Ques3740 {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        // min answer store karne ke liye (initially bada value)
        int min = (int)1e9;
        // i = first index
        for(int i = 0; i < n - 2; i++) {
            // j = second index
            for(int j = i + 1; j < n - 1; j++) {
                // agar nums[i] aur nums[j] equal nahi hai
                // to aage check karne ka koi fayda nahi
                if(nums[i] != nums[j]) continue;
                // k = third index
                for(int k = j + 1; k < n; k++) {
                    // agar tino equal mil gaye
                    if(nums[i] == nums[j] && nums[j] == nums[k]) {
                        // distance calculate kar rahe hain
                        int ans = Math.abs(i - j)
                                + Math.abs(j - k)
                                + Math.abs(k - i);
                        // minimum update karo
                        min = Math.min(ans, min);
                        // ek mil gaya to aage k check karne ki zarurat nahi
                        break;
                    }
                }
            }
        }
        // agar koi triplet nahi mila
        if(min >= (int)1e9) {
            return -1;
        }
        else {
            return min;
        }
    }
}

