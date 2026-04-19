package Arrays;

class Ques1855 {
    /*
     * Function: maxDistance
     * ----------------------
     * Find maximum (j - i) such that:
     * i ≤ j AND nums1[i] ≤ nums2[j]
     *
     * Approach:
     * Two Pointer (Optimal O(n))
     */
    public int maxDistance(int[] nums1, int[] nums2) {
        int left = 0;   // pointer for nums1
        int right = 0;  // pointer for nums2
        int ans = 0;
        while(left < nums1.length && right < nums2.length) {
            if(nums1[left] <= nums2[right]) {
                // distance update
                ans = Math.max(ans, right - left);
                // right ko aage badhao (distance increase karne ke liye)
                right++;
            }
            else {
                // invalid → left badhao
                left++;
                // ensure i ≤ j
                if(left > right) {
                    right = left;
                }
            }
        }

        return ans;
    }
}
