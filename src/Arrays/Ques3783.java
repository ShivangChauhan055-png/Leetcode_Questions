package Arrays;
 class Ques3783 {
    public int reverse(int n){
        int rev =0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        int ans = Math.abs(n - reverse(n));
        return ans;
    }
}
