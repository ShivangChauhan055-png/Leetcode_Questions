package Arrays;

// Ques53.java
// LeetCode 53 : Maximum Subarray
// Optimized solution using Kadane's Algorithm (TC : O(n), SC : O(1))

public class Ques53 {

    public int maxSubArray(int[] nums) {

        // max → ab tak ka best answer store karega
        int max = Integer.MIN_VALUE;

        // sum → current subarray ka running sum
        int sum = 0;

        // pura array traverse karenge
        for (int i = 0; i < nums.length; i++) {

            // current element ko running sum me add karo
            sum += nums[i];

            // max update karo → jo bhi best mila ho ab tak
            max = Math.max(max, sum);

            // agar sum negative ho gaya to usse reset kar denge
            // kyunki negative sum next subarray ko sirf kharab karega
            if (sum < 0) {
                sum = 0;
            }
        }

        // final answer → maximum subarray sum
        return max;
    }

    // Optional testing
    public static void main(String[] args) {
        Ques53 obj = new Ques53();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(arr));
    }
}

