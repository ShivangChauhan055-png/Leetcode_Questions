package String;

// Ques1021.java
// LeetCode 1021: Remove Outermost Parentheses
// Logic: count open brackets -> skip outermost

public class Ques1021 {

    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int count = 0; // current '(' ka count

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                // agar count > 0 hai -> ye outermost nahi
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            }

            else { // ')'
                count--;
                // agar count > 0 hai -> ye inner bracket hai
                if (count > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }

    // Testing
    public static void main(String[] args) {
        Ques1021 obj = new Ques1021();

        System.out.println(obj.removeOuterParentheses("(()())(())"));
        // Output: "()()()"

        System.out.println(obj.removeOuterParentheses("(()())(())(()(()))"));
        // Output: "()()()()(())"

        System.out.println(obj.removeOuterParentheses("()()"));
        // Output: ""
    }
}

