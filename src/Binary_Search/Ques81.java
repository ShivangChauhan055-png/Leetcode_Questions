package Binary_Search;

// Ques81.java

class Ques81 {

    // ================== APPROACH 1 ==================
    //  Linear Search (Simple but slow)
    // TC = O(n)
    public boolean searchLinear(int[] nums, int target) {
        // simple loop chala ke check karo
        for (int i = 0; i < nums.length; i++) {
            // agar target mil gaya → true
            if (nums[i] == target) {
                return true;
            }
        }
        // nahi mila
        return false;
    }


    // ================== APPROACH 2 ==================
    //  Binary Search (Optimized with duplicates)
    // TC = O(log n) average, O(n) worst (due to duplicates)
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // agar mid hi target hai
            if (nums[mid] == target) return true;
            //  IMPORTANT CASE (duplicates)
            // agar left = mid = right → decide nahi kar pa rahe sorted part
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            //  LEFT part sorted hai
            else if (nums[mid] >= nums[low]) {
                // check karo target is range me hai ya nahi
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;   // left side me jao
                } else {
                    low = mid + 1;    // right side me jao
                }
            }
            //  RIGHT part sorted hai
            else {
                // check karo target is range me hai ya nahi
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;    // right side me jao
                } else {
                    high = mid - 1;   // left side me jao
                }
            }
        }
        // agar target nahi mila
        return false;
    }
}
