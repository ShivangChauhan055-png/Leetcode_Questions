package Arrays;

public class Ques485 {

    // LeetCode 485: Max Consecutive Ones
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;   // overall maximum consecutive 1s
        int c = 0;     // current consecutive 1s count
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;                       // 1 mila → count badhao
                max = Math.max(max, c);    // max update karo
            } else {
                c = 0;                     // 0 mila → count reset
            }
        }
        return max;
    }
}

