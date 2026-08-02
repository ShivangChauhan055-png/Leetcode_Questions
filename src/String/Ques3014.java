package String;

class Solution {
    public int minimumPushes(String word) {
        // int ans = 0;
        // int n = word.length();
        // for(int i=0;i<n;i++){
        //     ans+=(i/8 +1);
        // }
        // return ans;

        // approach 2
        // int ans = 0;
        // HashSet<Character> s = new HashSet<>();
        // for(char ch : word.toCharArray()){
        //     s.add(ch);
        // }
        // int res = 1;
        // int size = s.size();
        // while(size>0){
        //     ans += Math.min(size,8)*res;
        //     res++;
        //     size -=8;
        // }
        // return ans;

        // approach 3
        int n = word.length();
        return n+Math.max(n-8,0)+Math.max(n-16,0)+Math.max(n-24,0);
    }
}
