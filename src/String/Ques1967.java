package String;

class Ques1967 {
    public int numOfStrings(String[] patterns, String word) {
        // simple approach just search in patterns array that word of s is present or not
        int count = 0;
        for(String s : patterns){
            if(word.contains(s)) count++;
        }
        return count;
    }
}