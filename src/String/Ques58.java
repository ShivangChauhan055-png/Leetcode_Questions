package String;

// Ques58.java
// LeetCode 58 : Length of Last Word
//
// Yaha 3 approaches diye hain:
//
// 1) Optimized (trim + lastIndexOf)   Best simple code
// 2) Reverse Traversal                Most asked in interviews
// 3) Split Method                     Easiest, but uses extra memory

public class Ques58 {

    // ----------------------------------------------------------
    // APPROACH 1 : trim() + lastIndexOf(' ')
    // ----------------------------------------------------------
    // IDEA:
    //    -> trim() se end ke spaces hat jayenge
    //    -> lastIndexOf(' ') → last space ka index bata dega
    //    -> last word size = length - (lastSpaceIndex + 1)
    //
    // Example:
    // "Hello World"
    // lastIndexOf = 5 → word length = 11 - 6 = 5
    //
    public int lengthOfLastWord1(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }


    // ----------------------------------------------------------
    // APPROACH 2 : Reverse Traversal (Two-pointer)
    // ----------------------------------------------------------
    // IDEA:
    //    -> Last se start karo
    //    -> pehle trailing spaces skip karo
    //    -> jab tak alphabets milte rahe → count++
    //    -> jese hi space mile → break
    //
    // Ye approach interviews me sabse zyada pucha jata hai.
    //
    public int lengthOfLastWord2(String s) {
        int i = s.length() - 1;
        int count = 0;

        // Step 1: skip ending spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }


    // ----------------------------------------------------------
    // APPROACH 3 : Split method
    // ----------------------------------------------------------
    // IDEA:
    //    -> split(" ") se words mil jayenge
    //    -> last word ka length return kar dena
    //
    // NOTE:
    //    -> easy but slow
    //    -> extra memory lagti hain
    //
    public int lengthOfLastWord3(String s) {
        String[] parts = s.trim().split(" ");
        return parts[parts.length - 1].length();
    }


    // ----------------------------------------------------------
    // Main method for testing all 3 approaches
    // ----------------------------------------------------------
    public static void main(String[] args) {

        Ques58 obj = new Ques58();

        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("--- Approach 1 ---");
        System.out.println(obj.lengthOfLastWord1(s1)); // 5
        System.out.println(obj.lengthOfLastWord1(s2)); // 4
        System.out.println(obj.lengthOfLastWord1(s3)); // 6

        System.out.println("--- Approach 2 ---");
        System.out.println(obj.lengthOfLastWord2(s1)); // 5
        System.out.println(obj.lengthOfLastWord2(s2)); // 4
        System.out.println(obj.lengthOfLastWord2(s3)); // 6

        System.out.println("--- Approach 3 ---");
        System.out.println(obj.lengthOfLastWord3(s1)); // 5
        System.out.println(obj.lengthOfLastWord3(s2)); // 4
        System.out.println(obj.lengthOfLastWord3(s3)); // 6
    }
}

