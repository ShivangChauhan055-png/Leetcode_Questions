package Arrays;

public class SecondLargest {
    static class Solution {
        public int secondLargestElement(int[] nums) {
            int lar = nums[0];
            int slar = -1;


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > lar) {
                    slar = lar; // update second largest
                    lar = nums[i]; // update largest
                } else if (nums[i] > slar && nums[i] != lar) {
                    slar = nums[i];
                }
            }
            return slar;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {10, 40, 20, 5, 30};
        System.out.println(s.secondLargestElement(arr));
    }
}

