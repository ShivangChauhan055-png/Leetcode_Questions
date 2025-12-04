package Arrays;

// Ques1800.java
// LeetCode 1800 : Maximum Ascending Subarray Sum
// Logic: Continuously increasing (strictly ascending) subarray ka maximum sum find karna

public class Ques1800 {

    public int maxAscendingSum(int[] nums) {

        // sum → current ascending subarray ka sum
        // max → ab tak ka best sum (final answer)
        int sum = nums[0];
        int max = nums[0];

        // array ko 1 se traverse karenge kyunki nums[0] already consider ho chuka hai
        for (int i = 1; i < nums.length; i++) {

            // agar current element previous se bada hai → ascending continue hai
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];    // same ascending chain me add karo
            } else {
                // ascending break ho gayi → nayi chain start hogi
                sum = nums[i];     // sum ko reset to current element
            }

            // har step par max update karte rahenge
            max = Math.max(max, sum);
        }

        // final maximum ascending subarray ka sum
        return max;
    }

    // Optional: test
    public static void main(String[] args) {
        Ques1800 obj = new Ques1800();
        int[] arr = {10, 20, 30, 5, 10, 50};
        System.out.println(obj.maxAscendingSum(arr)); // Output: 65
    }
}

