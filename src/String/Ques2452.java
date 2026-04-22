package String;
import java.util.*;
class Ques2452 {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        // brute force tc --> O(n*n*n)
        List<String> ans = new ArrayList<>();
        for(String s : queries){
            for(String d : dictionary){
                int diff = 0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)!=d.charAt(i)) diff++;
                    if(diff>2) break;
                }
                if(diff<=2){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
}
