package Arrays;

class Ques2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        // simple use 2 pointers
        int n = nums1.length;
        int m = nums2.length;
        int left =0 , right =0;
        while(left<n && right<m){
            if(nums1[left]==nums2[right]) return nums1[left];
            else if(nums1[left]<nums2[right]) left++;
            else right++;
        }
        return -1;
    }
}
