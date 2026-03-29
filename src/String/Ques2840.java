package String;

import java.util.*;
/*
    Ques2840.java
    Problem : Check if two strings can be made equal (even-odd swaps)
    Idea:
    Hum sirf un characters ko swap kar sakte hain
    jinka index difference even ho (j - i = even)

    --> iska matlab:
        even index wale characters sirf even me hi swap honge
        odd index wale characters sirf odd me hi swap honge

    --------------------------------------------------

    Approach:

    1. even positions ka frequency match hona chahiye
    2. odd positions ka frequency match hona chahiye

    agar dono match → true
    warna → false
*/

public class Ques2840 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(checkStrings(s1, s2));
    }

    // ======================================
    // Main Logic
    // ======================================
    public static boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        int[] even = new int[26];
        int[] odd = new int[26];
        // frequency count
        for(int i = 0; i < n; i++){
            // EVEN INDEX
            if(i % 2 == 0){
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            }
            // ODD INDEX
            else{
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }
        // check mismatch
        for(int i = 0; i < 26; i++){
            if(even[i] != 0 || odd[i] != 0){
                return false;
            }
        }
        return true;
    }
}


