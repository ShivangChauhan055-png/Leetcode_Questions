package Arrays;

// Ques3577.java
// Yaha hum permutations count kar rahe hain under a condition:
// Agar koi bhi element first element se chhota ya equal hua => answer 0
// Nahi to (n-1)! calculate kar dete hain MOD ke saath.

import java.util.*;

public class Ques3577 {

    // Ye method permutations count karta hai
    public int countPermutations(int[] complexity) {
        // Standard mod 10^9+7
        int mod = 1000000007;

        long ans = 1;

        // i = 1 se start kyunki (n-1)! karna hai
        for (int i = 1; i < complexity.length; i++) {

            // Condition: sab elements strictly greater hone chahiye first element se
            if (complexity[i] <= complexity[0]) {
                return 0;
            }

            // factorial (n-1)! multiply ho raha
            ans = (ans * i) % mod;
        }

        return (int) ans;
    }

    // Simple test using main() - IntelliJ mein run kar sakte ho
    public static void main(String[] args) {
        Ques3577 obj = new Ques3577();

        // Test sample input
        int[] arr = {3, 4, 5, 6};

        int result = obj.countPermutations(arr);
        System.out.println("Answer: " + result);

        // Tum khud input bhi de sakte ho:
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] = sc.nextInt();
        // System.out.println(obj.countPermutations(a));
    }
}

