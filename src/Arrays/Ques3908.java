package Arrays;

class Ques3908 {
    public boolean validDigit(int n, int x) {
        // approach 1
        // int num = n;
        // boolean found = false;
        // while(num>0){
        //     int digit = num%10;
        //     if(digit ==x) found = true;
        //     num /=10;
        // }
        // if(!found) return false;
        // num = n;
        // while(num>=10){
        //     num/=10;
        // }
        // int first = num;
        // return first!=x;

        // approach 2
        String s = String.valueOf(n);
        char ch = (char)(x+'0');
        return s.contains(String.valueOf(ch)) && s.charAt(0)!=ch ;
    }
}