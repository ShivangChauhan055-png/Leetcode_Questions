package String;

public class Ques2586 {

    // Ye function count karega vowel strings ko
    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        // sirf left se right tak traverse karenge
        for (int i = left; i <= right; i++) {

            // first aur last character check
            if (isVowel(words[i].charAt(0)) &&
                    isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }

    // helper function: vowel check karne ke liye
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    // main method
    public static void main(String[] args) {

        String[] words = {"are", "amy", "u"};
        int left = 0;
        int right = 2;

        int result = vowelStrings(words, left, right);
        System.out.println(result); // Output: 2
    }
}

