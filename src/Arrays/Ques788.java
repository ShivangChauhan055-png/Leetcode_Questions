package Arrays;

class Ques788 {
    public int rotatedDigits(int n) {
        // simple approach
        // tc --> O(n * logn)
        int count =0;
        for(int i=1;i<=n;i++){
            int num = i;
            boolean valid = true;
            boolean change = false;
            while(num>0){
                int d = num%10;
                if(d==3||d==4||d==7){
                    valid = false;
                    break;
                }
                if(d==2||d==5||d==6||d==9){
                    change = true;
                }
                num/=10;
            }
            if(valid && change) count++;
        }
        return count;
    }
}
