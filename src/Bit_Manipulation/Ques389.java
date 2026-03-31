package Bit_Manipulation;


// Ques389.java
// Problem: Find the Difference (LeetCode 389)

class Ques389 {
    public char findTheDifference(String s, String t) {
        // ek variable le liya jisme XOR store karenge
        char ans = 0;
        // Step 1: s ke sab characters XOR kar do
        for(char c : s.toCharArray()){
            ans ^= c;
        }
        // Step 2: t ke sab characters XOR kar do
        for(char x : t.toCharArray()){
            ans ^= x;
        }
        // jo extra character hoga wahi bach jayega
        return ans;
    }
}


