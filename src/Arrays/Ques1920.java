package Arrays;
import java.util.*;


public class Ques1920 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Ques1920 obj = new Ques1920();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = obj.buildArray(nums);
        System.out.println(Arrays.toString(result));
    }
}

        /*
         Approach 1 → Using O(n)
Initialize a different array temp and simply implement the condition asked in the problem statement
directly for every index in `ans`.
         */



