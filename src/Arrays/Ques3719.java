package Arrays;
import java.util.HashSet;

public class Ques3719 {

    public static void main(String[] args) {
        MySolution s = new MySolution();
        int[] nums = {2, 3, 4, 5};
        System.out.println(s.longestBalanced(nums));
    }
}

class MySolution {
    public int longestBalanced(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    even.add(nums[j]);
                } else {
                    odd.add(nums[j]);
                }
                if (even.size() == odd.size()) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}
