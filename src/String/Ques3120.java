package String;

class Ques3120 {
    public int numberOfSpecialChars(String word) {
        // simple approach
        // first check whether word has lower and upper case letter
        // if both present count letter in word
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)) lower[ch-'a'] = true;
            else upper[ch-'A'] = true;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(lower[i] && upper[i]) count++;
        }
        return count;
    }
}
