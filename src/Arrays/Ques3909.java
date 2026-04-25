package Arrays;

class Ques3909 {
    public int compareBitonicSums(int[] nums) {
        // simple brute force
        // aproach first find peak element
        // then find ascending and descending part separately
        // after that check the return conditions
        int n = nums.length;
        int ans = n;
        for(int i=1;i<n-1;i++){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                ans = i;
                break;
            }
        }
        long sum1 =0, sum2 =0;
        for(int i =0;i<=ans;i++){
            sum1+=nums[i];
        }
        for(int i=ans;i<n;i++){
            sum2+=nums[i];
        }
        if(sum1>sum2) return 0;
        else if(sum1<sum2) return 1;
        else return -1;
    }
}
