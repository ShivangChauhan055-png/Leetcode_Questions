package Arrays;


// Ques918.java
// LeetCode 918 : Maximum Sum Circular Subarray
// Idea: Kadane algorithm + circular array trick

class Ques918 {

    public int maxSubarraySumCircular(int[] nums) {
        // totalSum = pure array ka sum
        int totalSum = nums[0];
        // normal maximum subarray ke liye (Kadane)
        int maxi = nums[0];
        int currMax = nums[0];
        // minimum subarray ke liye (circular case ke liye)
        int mini = nums[0];
        int currMin = nums[0];
        // index 1 se start kyuki 0 already consider ho chuka
        for(int i = 1; i < nums.length; i++){
            // -------- NORMAL MAX SUBARRAY (Kadane) --------
            // ya to current element se start kare
            // ya previous subarray me add kare
            currMax = Math.max(nums[i], currMax + nums[i]);
            // overall maximum update
            maxi = Math.max(currMax, maxi);

            // -------- MINIMUM SUBARRAY --------
            // same kadane logic but minimum ke liye
            currMin = Math.min(nums[i], currMin + nums[i]);

            // overall minimum update
            mini = Math.min(currMin, mini);

            // -------- TOTAL SUM --------
            totalSum += nums[i];
        }
        // -------- EDGE CASE --------
        // agar saare numbers negative hai
        // to circular logic galat ho jayega
        if(mini == totalSum) return maxi;

        // -------- FINAL ANSWER --------
        // 2 possibilities:
        // 1. normal subarray (maxi)
        // 2. circular subarray (totalSum - minimum subarray)

        return Math.max(maxi, totalSum - mini);
    }
}


