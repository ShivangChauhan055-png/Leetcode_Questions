package String;

class Ques2833 {
    public int furthestDistanceFromOrigin(String moves) {
        int l =0 , r =0 , spaces =0;
        for(char ch : moves.toCharArray()){
            if(ch=='L') l++;
            else if(ch=='R') r++;
            else spaces++;
        }
        return Math.abs(l-r)+spaces;
    }
}
