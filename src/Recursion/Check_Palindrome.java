package Recursion;

public class Check_Palindrome {

    public static boolean palindromeCheck(String s) {
        return helper(s, 0, s.length() - 1);
    }

    private static boolean helper(String s, int left, int right) {
        if (left >= right) return true;

        if (s.charAt(left) != s.charAt(right))
            return false;

        return helper(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (palindromeCheck(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is NOT a palindrome");
        }
    }
}

