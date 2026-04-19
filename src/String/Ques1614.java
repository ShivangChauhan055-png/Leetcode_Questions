package String;

class Ques1614 {
    public int maxDepth(String s) {
        // simple approach
        // nested depth parentheses nikalne h to ( count++ kr do and ) count--
        // maximum count store krte jao
        // tc -->O(n) sc -> O(1)
        int count =0;
        int maxi = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                count++;
                if(count>maxi) maxi = count;
            }else if(ch==')'){
                count--;
            }
        }
        return maxi;
    }
}
