package Arrays;

import java.util.*;
import java.util.HashMap;
public class Ques1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }

    // Brute-force solution (without HashMap)
    // tle - O(n*n)
    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};

        // using hashMap
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c  = target-nums[i];
            if(m.containsKey(c)){
                return new int[]{i,m.get(c)};
            }else{
                m.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};

    }
}
