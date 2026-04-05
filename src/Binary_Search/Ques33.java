package Binary_Search;


// Ques33.java

class Ques33 {

    // ================== APPROACH 1 ==================
    //  Linear Search (Simple but slow)
    // TC = O(n)
    public int searchLinear(int[] nums, int target) {
        // simple loop chala ke har element check karenge
        for (int i = 0; i < nums.length; i++) {
            // agar target mil gaya → index return
            if (nums[i] == target) {
                return i;
            }
        }
        // agar pura array check karke bhi nahi mila
        return -1;
    }


    // ================== APPROACH 2 ==================
    //  Binary Search (Optimized)
    // TC = O(log n)
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // agar mid hi target hai
            if (nums[mid] == target) return mid;
            //  STEP 1: check karo kaunsa part sorted hai
            // LEFT part sorted hai
            if (nums[mid] >= nums[left]) {
                // STEP 2: check karo target is range me hai ya nahi
                // agar target left aur mid ke beech me hai
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;   // left side me search
                } else {
                    left = mid + 1;    // right side me search
                }
            } else {
                // RIGHT part sorted hai
                // agar target mid aur right ke beech me hai
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;    // right side me search
                } else {
                    right = mid - 1;   // left side me search
                }
            }
        }
        // agar target nahi mila
        return -1;
    }
}
