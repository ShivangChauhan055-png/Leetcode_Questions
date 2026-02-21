package Arrays;

public class Ques762 {
    public static void main(String[] args) {
        Solutio sol = new Solutio();
        int left = 6;
        int right = 10;
        System.out.println(sol.countPrimeSetBits(left, right));
    }
}
class Solutio {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        // left se right tak loop
        for (int i = left; i <= right; i++) {
            // Integer.bitCount(i) = number ke binary me kitne 1 hain
            int bit = Integer.bitCount(i);
            // agar wo prime hai to count++
            if (isPrime(bit)) count++;
        }
        return count;
    }
    // Prime check function
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
