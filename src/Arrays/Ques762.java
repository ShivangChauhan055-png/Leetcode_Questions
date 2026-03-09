
/*
    Ques762.java
    Problem : Count Prime Set Bits

    Hume left se right tak numbers diye hote hain.
    Har number ka binary representation dekhna hai
    aur count karna hai ki usme kitne 1 bits hain.

    Agar number of set bits PRIME hai
    to us number ko count karenge.

    Example:
    left = 6
    right = 10

    Numbers:

    6  -> 110  -> set bits = 2 (prime)
    7  -> 111  -> set bits = 3 (prime)
    8  -> 1000 -> set bits = 1 (not prime)
    9  -> 1001 -> set bits = 2 (prime)
    10 -> 1010 -> set bits = 2 (prime)

    Answer = 4
*/

public class Ques762 {

    public static void main(String[] args) {

        int left = 6;
        int right = 10;

        System.out.println(countPrimeSetBits(left, right));
    }


    // =========================================
    // Main Logic
    // =========================================
    public static int countPrimeSetBits(int left, int right){

        int count = 0;

        // left se right tak numbers check karte hain
        for(int i = left; i <= right; i++){

            // Integer.bitCount(i)
            // ye binary me kitne 1 hain wo batata hai

            int bits = Integer.bitCount(i);

            // agar bits prime hain
            if(isPrime(bits))
                count++;
        }

        return count;
    }


    // =========================================
    // Prime check function
    // =========================================
    public static boolean isPrime(int n){

        if(n <= 1)
            return false;

        for(int i = 2; i * i <= n; i++){

            if(n % i == 0)
                return false;
        }

        return true;
    }
}
