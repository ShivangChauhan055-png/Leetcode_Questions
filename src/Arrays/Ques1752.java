package Arrays;

public class Ques1752 {
    static class Solution {
        public boolean check(int[] nums) {
// Count how many times nums[i] < nums[i-1]
// This finds the "breaks" in sorted order
            int count = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    count++; // sorted break mila
                }
            }
// Rotation check
// Agar last element > first element hua,
// to iska matlab ek extra break rotation se aata hai
            if (nums[nums.length - 1] > nums[0]) {
                count++;
            }
// count <= 1 ka matlab:
// count==0 breaks → array already sorted
//count== 1 break → array sorted + rotated
// count >1 breaks → invalid
            return count <= 1;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 4, 5, 1, 2};


        System.out.println(s.check(arr));
    }
}
