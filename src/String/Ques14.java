package String;

class Ques14 {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int index = 0;
        for(char ch : strs[0].toCharArray()){
            for(int i=0;i<strs.length;i++){
                if(index>=strs[i].length() || ch!=strs[i].charAt(index)) return ans;
            }
            ans +=ch;
            index++;
        }
        return ans;
    }
}
