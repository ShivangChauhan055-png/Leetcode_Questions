package String;

public class Ques744 {

    // LeetCode 744: Find Smallest Letter Greater Than Target
    public char nextGreatestLetter(char[] letters, char target) {
        for (char l : letters) {
            if (l > target) {
                return l;
            }
        }
        return letters[0];
    }

    // main method to run
    public static void main(String[] args) {
        Ques744 obj = new Ques744();
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char result = obj.nextGreatestLetter(letters, target);
        System.out.println("Next greatest letter: " + result);
    }
}

