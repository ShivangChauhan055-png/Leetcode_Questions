package Math;

public class Ques29 {

    static class Solution {
        public int divide(int dividend, int divisor) {
            // // first overflow check kr liya
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }
            // sign of answer
            boolean neg = (dividend < 0) ^ (divisor < 0);

            long a = Math.abs((long) dividend);
            long b = Math.abs((long) divisor);

            int ans = 0;

            for (int s = 31; s >= 0; s--) { // loop 31 bit tk hi jaega kyuki int 32 ka h
                if ((a >> s) >= b) { // dividend / 2^s krte jaa rhe
                    a -= (b << s);   // multiply krke minus krti jaa rhi h
                    ans += (1 << s);
                }
            }

            return neg ? -ans : ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.divide(10, 3));   // 3
        System.out.println(s.divide(7, -3));   // -2
    }
}

