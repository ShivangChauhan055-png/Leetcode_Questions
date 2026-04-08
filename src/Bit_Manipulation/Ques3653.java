package Bit_Manipulation;

class Ques3653 {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;
        // har query process kar rahe hain
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];

            // l se r tak k step se jao
            while (l <= r) {
                // multiplication karte time overflow avoid karne ke liye 1L use kiya
                nums[l] = (int)((1L * nums[l] * v) % mod);
                // next index (step k)
                l += k;
            }
        }
        int ans = 0;
        // final XOR nikaal lo
        for (int a : nums) {
            ans ^= a;
        }
        return ans;
    }
}
