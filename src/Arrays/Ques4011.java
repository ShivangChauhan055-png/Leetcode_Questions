package Arrays;

class Ques4011 {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        // simple approach
        // first in nums array count even and odd then apply these two conditions if they satisfied then count them and last return the count
        // tc -->O(n^n) becoz i calculate subarrays using two loops
        // sc --> O(1)

        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int x = 0 ,y =0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0) x++;
                else y++;
                if(y>0 && b*x <= a*y) ans++;
            }
        }
        return ans;
    }
}
