package Math;

class Ques3954 {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        for(int x = 1;x<=200;x++){
            if((Math.abs(n-x)<=k) && (n&x)==0) sum+=x;
        }
        return sum;
    }
}
