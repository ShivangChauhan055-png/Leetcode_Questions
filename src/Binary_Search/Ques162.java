package Binary_Search;

class Ques162 {
    // ================== APPROACH 1 ==================
    // Linear Search (Brute Force)
    // TC = O(n)
    public int findPeakLinear(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // left condition
            boolean left = (i == 0) || (nums[i] > nums[i - 1]);
            // right condition
            boolean right = (i == n - 1) || (nums[i] > nums[i + 1]);
            // agar dono satisfy ho rahe hain → peak mil gaya
            if (left && right) {
                return i;
            }
        }
        return -1;
    }
    // ================== APPROACH 2 ==================
    // Binary Search (Optimized)
    // TC = O(log n)
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        // edge cases
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // agar mid peak hai
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // increasing slope → right side jao
            else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            }
            // decreasing slope → left side jao
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

