package String;

class Ques13 {
    public int symbol(char ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        // main logic of this question
        // agr next bala symbol bda h current se to current ko - lo
        // agr next bala symbol small h to current ko + lo

        int n = s.length();
        int sum =0;
        for(int i=0;i<n;i++){
            char value = s.charAt(i);
            // (i+1)<n becoz check kr sake ki aage symbol h ki nhi
            if((i+1)<n && symbol(value) < symbol(s.charAt(i+1))){
                sum = sum - symbol(value);
            }else{
                sum = sum + symbol(value);
            }
        }
        return sum;
    }
}
