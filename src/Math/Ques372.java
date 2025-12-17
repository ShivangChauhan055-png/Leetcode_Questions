package Math;

// Ques372.java
// LeetCode 372 : Super Pow
// Concept: Binary Exponentiation + Modulo + Euler Totient

public class Ques372 {

    // Ye function fast power calculate karta hai
    // (a^b) % M using Binary Exponentiation
    public int binExp(int a, int b, int M) {

        int res = 1;      // final result
        a = a % M;        // pehle hi modulo le liya (overflow se bachne ke liye)

        // Jab tak power b > 0 hai
        while (b > 0) {

            // Agar b odd hai
            // to result me current a multiply kar do
            if ((b & 1) != 0) {
                res = (res * a) % M;
            }

            // a ko square kar do (power half hone wali hai)
            a = (a * a) % M;

            // b ko right shift -> b = b / 2
            b >>= 1;
        }

        return res;
    }

    // Main function
    // a^b % 1337 calculate karna hai
    // b ek array ke form me diya hua hai
    public int superPow(int a, int[] b) {

        // Euler Totient of 1337 = 1140
        int m = 1140;
        int exp = 0;

        // Step 1:
        // b[] array se actual exponent banaya
        // lekin direct nahi, modulo 1140 ke saath
        for (int i = 0; i < b.length; i++) {
            exp = (exp * 10 + b[i]) % m;
        }

        // Step 2:
        // Agar exponent 0 aa gaya
        // to use 1140 maan lo (Euler theorem rule)
        if (exp == 0) {
            exp = 1140;
        }

        // Step 3:
        // Final answer using fast exponentiation
        return binExp(a, exp, 1337);
    }

    // (Optional) main method testing ke liye
    public static void main(String[] args) {
        Ques372 obj = new Ques372();

        int[] b1 = {1, 0};
        System.out.println(obj.superPow(2, b1)); // 2^10 % 1337

        int[] b2 = {3};
        System.out.println(obj.superPow(2, b2)); // 2^3 % 1337
    }
}

