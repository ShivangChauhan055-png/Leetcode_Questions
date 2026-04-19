package Arrays;

// Ques3904.java

class Ques3903 {
    /*
     * Function: firstStableIndex
      --------------------------
     * Hume smallest index i find karna hai jaha:
     * instability = max(nums[0...i]) - min(nums[i...n-1]) ≤ k
     * Approach: Prefix Max + Suffix Min (O(n))
     */
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        // prefix max array (left side ka max store karega)
        int[] maxi = new int[n];
        // suffix min array (right side ka min store karega)
        int[] mini = new int[n];
        // base initialization
        maxi[0] = nums[0];
        mini[n - 1] = nums[n - 1];
        // Step 1: prefix max bana rahe hain
        // matlab har index tak ka maximum
        for(int i = 1; i < n; i++) {
            maxi[i] = Math.max(maxi[i - 1], nums[i]);
        }
        // Step 2: suffix min bana rahe hain
        // matlab har index se end tak ka minimum
        for(int i = n - 2; i >= 0; i--) {
            mini[i] = Math.min(mini[i + 1], nums[i]);
        }
        // Step 3: har index check karte hain
        for(int i = 0; i < n; i++) {
            // instability nikaal rahe hain
            int diff = maxi[i] - mini[i];
            // agar condition satisfy ho gayi
            if(diff <= k) {
                return i; // smallest index mil gaya
            }
        }
        // agar koi index valid nahi mila
        return -1;
    }
}
