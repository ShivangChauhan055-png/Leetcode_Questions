package Math;

class Ques3754 {
    public long sumAndMultiply(int n) {
        // simple math approach
        long newN = 0;
        long sum = 0;
        int place =1; // for maintain the correct order
        while(n>0){
            int d = n%10;
            if(d!=0){
                newN += d * place;
                sum+=d;
                place *=10;
            }
            n/=10;
        }
        return sum*newN;
    }
}
