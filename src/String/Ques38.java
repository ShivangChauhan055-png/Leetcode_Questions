package String;

// Ques38.java
// LeetCode 38 : Count and Say
// Approach: String processing + simulation

public class Ques38 {

    // Ye function nth term return karta hai Count and Say sequence ka
    public String countAndSay(int n) {

        // Base case:
        // First term hamesha "1" hota hai
        String res = "1";

        // 2nd term se nth term tak build karte jayenge
        for (int i = 1; i < n; i++) {
            res = buildNext(res);
        }

        return res;
    }

    // Ye helper function current string se
    // next Count-and-Say string banata hai
    public String buildNext(String s) {

        // Result ko efficient tareeke se build karne ke liye
        StringBuilder result = new StringBuilder();

        int count = 1;  // same characters ka count

        // String ko left se right traverse kar rahe hain
        for (int i = 1; i < s.length(); i++) {

            // Agar current char aur previous char same hai
            // to count badha do
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            // Agar different mil gaya
            else {
                // Pehle count likho
                // phir previous character likho
                result.append(count).append(s.charAt(i - 1));

                // Naye character ke liye count reset
                count = 1;
            }
        }

        // Loop ke baad last group ka data add karna zaroori hai
        result.append(count).append(s.charAt(s.length() - 1));

        // StringBuilder ko String me convert karke return
        return result.toString();
    }

    // (Optional) main method testing ke liye
    public static void main(String[] args) {
        Ques38 obj = new Ques38();

        System.out.println(obj.countAndSay(1)); // 1
        System.out.println(obj.countAndSay(2)); // 11
        System.out.println(obj.countAndSay(3)); // 21
        System.out.println(obj.countAndSay(4)); // 1211
        System.out.println(obj.countAndSay(5)); // 111221
    }
}

