package String;

import  java.util.*;
class Ques3517 {
    public String smallestPalindrome(String s) {
        // simple approach
        // hmme palimdrome property use krna h sitrng ko half kro and then sort kr lo
        // taki lexicography small m ho jae and remaining m mirror ki trh lga do bss

        int n = s.length();
        char[] half = s.substring(0,n/2).toCharArray();
        Arrays.sort(half);
        char[] ans = s.toCharArray();
        for(int i=0;i<half.length;i++){
            ans[i] = half[i];
        }
        for(int i=0;i<half.length;i++){
            ans[n-1-i] = half[i];
        }
        return new String(ans);
    }
}
