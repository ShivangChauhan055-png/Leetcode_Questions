package String;

class Ques8 {
    public int myAtoi(String s) {
        // simple approach jo steps bole h bo krte jao implement
        // Step 1 : space remove kr do
        s = s.trim();
        int n =s.length();
        // agr empty string ko 0 kr do
        if(s.isEmpty()) return 0;
        // Step 2 : sign set krna h
        int i =0,sign =1;// becoz(sign by default + lena h)
        if(i<n && s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign = s.charAt(i)=='-' ? -1 : 1;
            i++;
        }
        // Step 3 : digit bnana only
        long digit = 0;
        while(i<n && Character.isDigit(s.charAt(i))){ // ye check kr rha string m only digit ho jese hi kuch aur mila loop end
            digit = digit*10 + (s.charAt(i)-'0');

            // Step 4 : overflow check krna h
            if(digit*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(digit*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;

        }
        return (int)(digit*sign);
    }
}
