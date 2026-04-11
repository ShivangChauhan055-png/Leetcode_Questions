package Arrays;

import java.util.*;
class Ques3895 {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;
        // array ke har number pe loop
        for(int num : nums){
            // edge case (jab number 0 ho aur digit bhi 0 ho)
            if(num == 0 && digit == 0){
                count++;
                continue;
            }
            // number ke har digit ko check karenge
            while(num > 0){
                int lastDigit = num % 10;
                // agar digit match ho gaya
                if(lastDigit == digit){
                    count++;
                }
                // last digit hata do
                num = num / 10;
            }
        }
        return count;
    }
}


