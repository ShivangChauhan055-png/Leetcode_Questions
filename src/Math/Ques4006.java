package Math;

class Ques4006 {
    public int countValidPrefixes(String s) {
        // simple approach
        // to make string alternating no two char are equal means diff btw both the char is atmost one..... use that trick only
        // tc -->O(n) , sc-->O(1)

        int n = s.length();
        int zero = 0, one = 0 , count = 0;
        for(char ch : s.toCharArray()){
            if(ch =='0') zero++;
            else one++;
            if(Math.abs(zero-one)<=1) count++;
        }
        return count;
    }
}
