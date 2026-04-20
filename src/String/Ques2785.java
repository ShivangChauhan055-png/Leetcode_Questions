package String;
import java.util.*;
class Ques2785 {
    public boolean isVowel(char ch ){
        return "aeiouAEIOU".indexOf(ch) != -1 ;
    }
    public String sortVowels(String s) {
        /*
        Simple approach tc -->O(nlogn) sc -->O(n)
        String m se vowel nikal lo unne list m store kra lo and sort kr do
        ek new string bna ke unne shi order m place kr do and consonants remains same
        */
        List<Character > ls = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)) ls.add(ch);
        }
        Collections.sort(ls);
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for(char x : s.toCharArray()){
            if(isVowel(x)){
                ans.append(ls.get(idx++));
            }else{
                ans.append(x);
            }
        }
        return ans.toString();
    }
}
