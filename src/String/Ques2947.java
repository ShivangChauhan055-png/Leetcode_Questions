package String;

class Ques2947 {
    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!= -1;
    }
    public int beautifulSubstrings(String s, int k) {
        // tc -->O(n*n)
        int count =0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int vowels = 0, consonants = 0;
            for(int j=i;j<n;j++){
                if(isVowel(s.charAt(j))) vowels++;
                else consonants++;
                if(vowels==consonants && (vowels*consonants)%k ==0) count++;
            }
        }
        return count;
    }
}
