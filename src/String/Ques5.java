package String;

class Ques5 {
    public boolean isPalimdrome(String s){
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        // simple brute force tc -->O(n^3) sc -->O(n)
        // first check whether a string is palimdrome or not
        // iterate the string and take len variable to track maxlen of String
        // take a maxStr to store the maxlen palimdrome string
        if(s.length()<=1) return s;

        int n = s.length();
        int len = 1;
        String ans = s.substring(0,1); // to store 1st character
        for(int i=0;i<n;i++){
            for(int j=i+len;j<=n;j++){
                // i+len becoz to skip small substring
                if(j-i > len && isPalimdrome(s.substring(i,j))){
                    len = j-i;
                    ans = s.substring(i,j);
                }
            }
        }
        return ans;

        // optimized one using dp

    }
}
