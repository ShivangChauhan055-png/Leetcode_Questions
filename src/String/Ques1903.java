package String;
class Ques1903 {
    public String largestOddNumber(String num) {
        // right se traverse kar rahe hain
        for(int i = num.length() - 1; i >= 0; i--){
            // character ko digit me convert karo
            int n = num.charAt(i) - '0';
            // agar odd digit mila
            if(n % 2 == 1){
                // 0 se i tak ka substring return karo
                return num.substring(0, i + 1);
            }
        }
        // agar koi odd digit nahi mila
        return "";
    }
}

