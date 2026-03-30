package Bit_Manipulation;

// Ques191.java
// Leetcode 191 - Number of 1 Bits

class Ques191 {
    public int hammingWeight(int n) {
        // count → kitne 1 bits hai store karega
        int count = 0;
        // mask → har bit check karne ke liye (initially 000...0001)
        int mask = 1;
        // total 32 bits check karenge (int = 32 bits)
        for(int i = 0; i < 32; i++) {
            // (n & mask) → current bit check karega
            // agar result 0 nahi hai → matlab bit 1 hai
            if((n & mask) != 0) {
                count++;
            }
            // mask ko left shift kar diya → next bit check hogi
            mask <<= 1;
        }
        return count;
    }
}
