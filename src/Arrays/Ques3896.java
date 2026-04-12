package Arrays;

class Ques3896 {
    /*
     * Function: isPrime
     * -----------------
     * Checks whether a number is prime or not.
     */
    public boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Function: minOperations
     * -----------------------
     * Even index → value should be prime
     * Odd index  → value should be non-prime
     *
     * We increment values until they satisfy the condition.
     * Each increment = 1 operation.
     */

    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            int v = nums[i];
            // Even index → make it prime
            if(i % 2 == 0) {
                while(!isPrime(v)) {
                    v++;
                    count++;
                }
            }
            // Odd index → make it non-prime
            else {
                while(isPrime(v)) {
                    v++;
                    count++;
                }
            }
        }
        return count;
    }
}
