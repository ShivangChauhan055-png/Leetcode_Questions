package String;

// Ques205.java
// LeetCode 205 : Isomorphic Strings
// IDEA : Har character ka mapping (one-to-one) check karna hai.
//        s[i] hamesha t[i] se map hona chahiye, aur koi 2 characters ek hi char se map nahi hone chahiye.

import java.util.*;

public class Ques205 {

    public boolean isIsomorphic(String s, String t) {

        // Step 1: Agar dono strings ki length hi different hai,
        //         to kabhi one-to-one mapping possible nahi.
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Dono side mapping maintain karenge

        // s → t ki mapping
        HashMap<Character, Character> mapST = new HashMap<>();

        // t → s ki mapping (reverse mapping)
        HashMap<Character, Character> mapTS = new HashMap<>();

        // Step 3: Har index par character compare karenge
        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i); // source character (s)
            char ch2 = t.charAt(i); // target character (t)

            // ---------- Check s → t mapping ----------
            if (mapST.containsKey(ch1)) {
                // agar pehle se mapping hai aur voh mismatch hai → invalid
                if (mapST.get(ch1) != ch2) {
                    return false;
                }
            } else {
                // pehli baar mapping -> map me entry daal do
                mapST.put(ch1, ch2);
            }

            // ---------- Check t → s mapping ----------
            // iss se ye ensure hota hai ki koi 2 chars same char se map na kare
            if (mapTS.containsKey(ch2)) {
                if (mapTS.get(ch2) != ch1) {
                    return false;
                }
            } else {
                mapTS.put(ch2, ch1);
            }
        }

        // agar pura loop complete ho gaya bina false ke → strings isomorphic hain
        return true;
    }

    // ******** Optional Testing ********
    public static void main(String[] args) {
        Ques205 obj = new Ques205();

        System.out.println(obj.isIsomorphic("egg", "add"));
        System.out.println(obj.isIsomorphic("foo", "bar"));
        System.out.println(obj.isIsomorphic("paper", "title"));
        System.out.println(obj.isIsomorphic("ab", "aa"));
    }
}

