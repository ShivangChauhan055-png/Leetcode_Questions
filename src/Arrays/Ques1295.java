package Arrays;

public class Ques1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        int count = 0;

        for (int n : nums) {
            int digit = 0;
            int x = n;

            // Count digits
            while (x > 0) {
                digit++;
                x /= 10;
            }

            // Check even digit
            if (digit % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of numbers with even digits: " + count);
    }
}
