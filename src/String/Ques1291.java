package String;

import java.util.*;
class Ques1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        // simple string approach tc ->O(1)
        List<Integer> ls = new ArrayList<>();
        String l = String.valueOf(low);
        String h = String.valueOf(high);
        String s = "123456789";
        for(int i=l.length();i<=h.length();i++){
            for(int j =0;j<=9-i;j++){
                int num = Integer.parseInt(s.substring(j,j+i));
                if(num>=low && num<=high) ls.add(num);
            }
        }
        return ls;
    }
}
