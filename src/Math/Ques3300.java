package Math;

class Ques3300 {
    public int digit(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans+rem;
            n/=10;
        }
        return ans;
    }
    public int minElement(int[] nums) {
        /* simple approach just find the sum of digit and iterate nums with digit sum of each ele and find minimum of them */
        int mini = Integer.MAX_VALUE;
        for(int x : nums){
            mini = Math.min(mini, digit(x));
        }
        return mini;
    }
}
