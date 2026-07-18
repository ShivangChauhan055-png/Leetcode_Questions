package Math;

class Ques3658 {
    public int gcdOfOddEvenSums(int n) {
        // approach 1
        // return n;

        // approach 2
        return gcd(n*n , n*(n+1));
    }
    public int gcd(int a ,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
