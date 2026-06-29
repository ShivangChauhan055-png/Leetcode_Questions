package String;

class Ques1189 {
    public int maxNumberOfBalloons(String text) {
        // approach 1
        int b=0,a=0,l=0,o=0,n=0;
        // for(char ch : text.toCharArray()){
        //     switch(ch){
        //         case 'b' : b++ ; break;
        //         case 'a' : a++ ; break;
        //         case 'l' : l++ ; break;
        //         case 'o' : o++ ; break;
        //         case 'n' : n++ ; break;
        //     }
        // }
        // l = l/2;
        // o = o/2;
        // return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));

        // approach 2
        for(char ch : text.toCharArray()){
            if(ch == 'b') b++;
            else if(ch=='a') a++;
            else if(ch=='l')l++;
            else if(ch=='o')o++;
            else if(ch=='n')n++;
        }
        int ans = 0;
        ans = Math.min(b,a);
        ans = Math.min(ans,l/2);
        ans = Math.min(ans,o/2);
        ans = Math.min(ans,n);
        return ans;
    }
}
