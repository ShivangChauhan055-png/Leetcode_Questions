package String;

// Ques28.java
// LeetCode 28 : Find the Index of the First Occurrence in a String

public class Ques28 {

    // Ye function haystack ke andar needle ka
    // pehla index return karta hai
    // agar needle exist nahi karta to -1 return karega
    public int strStr(String haystack, String needle) {

        // Edge case:
        // Agar needle empty hai to by definition answer 0 hota hai
        if (needle.length() == 0) {
            return 0;
        }

        // i = starting index
        // j = ending index (exclusive)
        // j hamesha i + needle.length() rahega
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {

            // haystack ka substring nikala [i, j)
            // aur needle se compare kiya
            if (haystack.substring(i, j).equals(needle)) {
                return i;   // match mil gaya, index return
            }
        }

        // Agar kahin bhi match nahi mila
        return -1;
    }

    // (Optional) main method test karne ke liye
    public static void main(String[] args) {
        Ques28 obj = new Ques28();

        System.out.println(obj.strStr("sadbutsad", "sad")); // Output: 0
        System.out.println(obj.strStr("leetcode", "leeto")); // Output: -1
        System.out.println(obj.strStr("hello", "ll")); // Output: 2
    }
}

