package Math;

public class Reverse_Integer7 {
    // Function to reverse the integer
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            x /= 10;

            // Check overflow or underflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + rem;
        }
        return rev;
    }

    // Main method to test the code
    public static void main(String[] args) {
        System.out.println(reverse(123));   // Output: 321
        System.out.println(reverse(-456));  // Output: -654
        System.out.println(reverse(120));   // Output: 21
        System.out.println(reverse(1534236469)); // Output: 0 (overflow case)
    }
}
