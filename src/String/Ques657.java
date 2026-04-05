package String;

// Ques657.java

class Ques657 {
    public boolean judgeCircle(String moves) {
        //  simple simulation use kar rahe hai
        // x → left/right track karega
        // y → up/down track karega
        int x = 0, y = 0;
        // string ko char array me convert karke traverse karenge
        for (char ch : moves.toCharArray()) {
            // U → upar jao (y increase)
            if (ch == 'U') y++;
                // D → neeche jao (y decrease)
            else if (ch == 'D') y--;
                // R → right jao (x increase)
            else if (ch == 'R') x++;
                // L → left jao (x decrease)
            else if (ch == 'L') x--;
        }
        // final check
        // agar x = 0 aur y = 0 → robot wapas origin pe aa gaya
        return x == 0 && y == 0;
    }
}
