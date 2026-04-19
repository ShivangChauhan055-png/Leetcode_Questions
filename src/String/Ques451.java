package String;
import java.util.*;
class Ques451 {
    public String frequencySort(String s) {
        // simple brute force jo bola h bo kr do
        // tc --> O(n logn) sc --> O(n)
        // Step 1 tc -->O(n) & sc -->O(k)
        //hashmap m each characters ki freq kr lo
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char x : s.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        // Step 2 tc -->O(klogk)
        // map ko list m convert krke custom sorting kr dege becoz map direct sort nhi hota
        List<Character> ls = new ArrayList<>(mp.keySet());
        Collections.sort(ls,(a,b)->mp.get(b)-mp.get(a)); // b-a for descending order
        // Step 3
        // string builder lo usme each ele ki freq append krake return kr do
        StringBuilder sb = new StringBuilder();
        for(char ch : ls){
            int count = mp.get(ch);
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
