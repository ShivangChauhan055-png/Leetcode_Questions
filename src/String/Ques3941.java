package String;

import java.util.*;

class Ques3941 {
    public int passwordStrength(String password) {
        // simple approach
        // use hashset to avoid multiple entries and just use string function
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(char ch : password.toCharArray()){
            if(set.contains(ch)) continue;
            set.add(ch);
            // if(Character.isLowerCase(ch)) ans+=1;
            // else if(Character.isUpperCase(ch)) ans+=2;
            // else if(Character.isDigit(ch)) ans+=3;
            // else ans+=5;

            // rather than function we can directly use normal range
            if(ch>='a' && ch<='z') ans+=1;
            else if(ch>='A' && ch<='Z') ans+=2;
            else if(ch>='0' && ch<='9') ans+=3;
            else ans+=5;
        }
        return ans;
    }
}