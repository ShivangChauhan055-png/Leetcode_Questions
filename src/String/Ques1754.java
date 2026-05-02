package String;

class Ques1754 {
    public String largestMerge(String word1, String word2) {
        // tc -->O(n*n) sc -->O(n)
        // string to compare krte jao jo lexicographically bda h uska char append kro
        // last m remaining bale append kr do
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            if(word1.substring(i).compareTo(word2.substring(j))>0){
                sb.append(word1.charAt(i++));
            } // >0 mltb word1 ka char bda h agr <0 hota to word2 ka char lete
            else sb.append(word2.charAt(j++));
        }
        // remaining bali append kr do
        sb.append(word1.substring(i));
        sb.append(word2.substring(j));

        return sb.toString();
    }
}
