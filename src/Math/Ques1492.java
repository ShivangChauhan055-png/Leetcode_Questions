package Math;

// Ques1492.java
// Problem: LeetCode 1492 - The k-th Factor of n

/*
Idea simple hai bhai:

Hume ek number n diya hota hai
aur hume uske factors (divisors) nikalne hote hain.

Factor ka matlab:
agar n % i == 0
to i ek factor hai.

Steps:

1. 1 se n tak loop chalayenge.
2. Agar n % i == 0 hua to matlab i ek factor hai.
3. Us factor ko list me add kar dete hain.
4. Har factor milne par count badhate hain.
5. Jaise hi count == k ho jaye
   wahi factor answer hoga.

Agar loop khatam ho gaya aur k factors nahi mile
to answer -1 return karenge.

Example:

n = 12
Factors:
1 2 3 4 6 12
k = 3
Answer = 3

Time Complexity:
O(n)
Space Complexity:
O(n) (kyuki list use kar rahe hain)
*/

import java.util.*;

class Ques1492 {
    public int kthFactor(int n, int k) {
        int count = 0;
        // factors store karne ke liye list
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            // check kar rahe hain i factor hai ya nahi
            if(n % i == 0){
                ls.add(i);
                count++;
                // agar k-th factor mil gaya
                if(count == k){
                    return i;
                }
            }
        }
        // agar k-th factor exist nahi karta
        return -1;
    }
}
