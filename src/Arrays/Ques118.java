package Arrays;

import java.util.*;

public class Ques118 {
    static class Solution {
        // ek single row generate karne ka function
        public List<Integer> generateRow(int n){
            long ans = 1;
            // ek list banayi jisme row store hogi
            List<Integer> ls = new ArrayList<>();
            // har row ka first element hamesha 1 hota hai
            ls.add(1);
            // formula use karke baaki elements nikale
            for(int c = 1; c < n; c++){
                ans = ans * (n - c);   // upar wala part
                ans = ans / c;         // niche divide
                ls.add((int)ans);      // list me add kar diya
            }
            return ls;
        }
        // pura pascal triangle generate karne ka function
        public List<List<Integer>> generate(int numRows){
            // final answer ke liye list of lists
            List<List<Integer>> ans = new ArrayList<>();
            // har row ko generate karke ans me add kar diya
            for(int i = 1; i <= numRows; i++){
                ans.add(generateRow(i));
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int numRows = 5;   // kitni rows chahiye
        List<List<Integer>> result = obj.generate(numRows);
        // triangle print kar diya
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

