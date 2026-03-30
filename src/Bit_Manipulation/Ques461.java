package Bit_Manipulation;

// Ques461.java
// Problem: Hamming Distance
// Do numbers ke binary representation me kitne bits different hain

class Ques461 {
    public int Ques461(int x, int y) {
        // Step 1: XOR nikaalo
        // jaha bits different hongi waha 1 milega
        int xor = x ^ y;
        int count = 0;
        // Step 2: count karo kitne 1 hain
        while (xor > 0) {
            // last bit check kar rahe (0 ya 1)
            count = count + (xor & 1);
            // right shift kar rahe next bit check karne ke liye
            xor = xor >> 1;
        }
        // final answer = number of different bits
        return count;
    }
}

