package String;

class Ques1358 {
    public int numberOfSubstrings(String s) {
        // simple approach
        int a = -1 , b =-1 , c = -1;
        int ans= 0;
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a') a = i;
            else if(ch=='b') b = i;
            else c = i;
            mini = Math.min(c,Math.min(a,b));
            ans +=(1+mini);
        }
        return ans;
    }
}
