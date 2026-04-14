package String;

import java.util.*;

class Ques151 {
    public String reverseWords(String s) {
        // Step 1: extra spaces hatao (start & end se)
        s = s.trim();
        // Step 2: string ko words me tod do (multiple spaces handle ho jayenge)
        String[] ans = s.split("\\s+");
        // Step 3: array reverse karo (two pointer use karke)
        int left = 0, right = ans.length - 1;
        while(left < right){
            String temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }
        // Step 4: words ko join karo ek space ke saath
        return String.join(" ", ans);
    }
}


