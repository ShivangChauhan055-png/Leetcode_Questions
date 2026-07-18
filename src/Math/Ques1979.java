package Math;

class Ques1979 {
    public int findGCD(int[] nums) {
        // simple approach just apply what ask
        int max = nums[0];
        int min  = nums[0];
        for(int n : nums){
            max = Math.max(n,max);
            min = Math.min(n,min);
        }
        return gcd(max,min);
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
