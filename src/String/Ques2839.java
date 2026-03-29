package String;

import java.util.*;
/*
    Ques2839.java
    Problem : Check if two strings can be made equal
    Condition:
    Tum sirf even index waale characters ko aapas me swap kar sakte ho
    aur odd index waale characters ko aapas me swap kar sakte ho

    --------------------------------------------------
    Example:
    s1 = "abcd"
    s2 = "cdab"

    even positions (0,2):
        a,c  vs  c,a

    odd positions (1,3):
        b,d  vs  d,b

    → Answer = true
*/

public class Ques2839 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(canBeEqual(s1, s2));
    }
    // =========================================
    // Approach 1 : Direct Check (only for length 4)
    // =========================================
    /*
        Idea:
        even positions: 0,2
        odd positions : 1,3

        Bas check karo:
        even swap se match ho raha hai ya nahi
        aur odd swap se match ho raha hai ya nahi
    */
    public static boolean approach1(String s1, String s2){

        // even check
        boolean c1 =
                (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                        (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0));

        // odd check
        boolean c2 =
                (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                        (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1));

        return c1 && c2;
    }

    // =========================================
    // Approach 2 : Hashing (General approach)
    // =========================================
    /*
        Idea:
        even positions ke characters ka count same hona chahiye
        odd positions ke characters ka count same hona chahiye

        even[] → even index count
        odd[]  → odd index count
    */
    public static boolean canBeEqual(String s1, String s2){
        int[] even = new int[26];
        int[] odd = new int[26];
        for(int i = 0; i < 4; i++){
            if(i % 2 == 0){
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            }
            else{
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }
        // check
        for(int i = 0; i < 26; i++){
            if(even[i] != 0 || odd[i] != 0)
                return false;
        }
        return true;
    }
}


