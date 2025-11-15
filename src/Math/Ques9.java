package Math;

public class Ques9 {
    public static void main(String[] args) {
        int x = 121;  // number check krna h palindrome h ya nhi

        // agr number negative h ya 0 pe end ho rha h (but khud 0 nhi) → wo palindrome nhi h
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            System.out.println("false");
            return;
        }

        int reversed = 0;
        int original = x;

        // ab number ko reverse krte ja rhe h
        while (x > 0) {
            int digit = x % 10;               // last digit nikalo
            reversed = reversed * 10 + digit; // reversed me jodo
            x = x / 10;                       // last digit hatao
        }

        // agr reversed == original → palindrome h
        if (original == reversed)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
