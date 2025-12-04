package String;

// Ques242.java
// LeetCode 242 : Valid Anagram
// Logic: sort both strings and compare
// TC: O(n log n), SC: O(n)

import java.util.*;

public class Ques242 {

    public boolean isAnagram(String s, String t) {

        // agar size different hai → kabhi anagram nahi
        if (s.length() != t.length()) return false;

        // strings ko char array me convert karo
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        // dono arrays ko sort kar do
        Arrays.sort(s1);
        Arrays.sort(s2);

        // agar dono sorted same hai → anagram
        return Arrays.equals(s1, s2);
    }

    // optional testing
    public static void main(String[] args) {
        Ques242 obj = new Ques242();
        System.out.println(obj.isAnagram("anagram", "nagaram")); // true
        System.out.println(obj.isAnagram("rat", "car"));         // false
    }
}

