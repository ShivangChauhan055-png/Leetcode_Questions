package Math;

class Ques4010 {
    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long maxPairStrength(int[] nums) {
        // simple find the maximum of this condition
        // tc-->O(n*n) ,  sc -->O(n)
        int n = nums.length;
        long ans = Long.MIN_VALUE;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long p = (long) nums[i] * nums[j];
                long g = gcd(nums[i],nums[j]);
                ans = Math.max(ans,p/(g*g));
            }
        }
        return ans;
    }
}
