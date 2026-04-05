package Binary_Search;

class Ques153 {
    // ================== APPROACH 1 ==================
    //  Linear Search (Simple but slow)
    // TC = O(n)
    public int findMinLinear(int[] nums) {
        int ans = Integer.MAX_VALUE;
        // pura array traverse karo
        for (int i = 0; i < nums.length; i++) {
            // minimum update karte jao
            ans = Math.min(ans, nums[i]);
        }
        return ans;
    }

    // ================== APPROACH 2 ==================
    //  Binary Search (Optimized)
    // TC = O(log n)
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //  agar LEFT part sorted hai
            if (nums[low] <= nums[mid]) {
                // matlab left part me minimum nums[low] hoga
                ans = Math.min(ans, nums[low]);
                // ab right side explore karo
                low = mid + 1;
            } else {
                //  warna RIGHT part sorted nahi hai → pivot idhar hai
                // mid minimum ho sakta hai
                ans = Math.min(ans, nums[mid]);
                // left side explore karo
                high = mid - 1;
            }
        }
        return ans;
    }
}
