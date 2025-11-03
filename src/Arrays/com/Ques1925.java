package Arrays.com;

public class Ques1925 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int n = num;

            // Count digits
            while (n > 0) {
                digits++;
                n /= 10;
            }

            // If digits are even
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}


