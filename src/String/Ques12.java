package String;
class Ques12 {
    public String intToRoman(int num) {
        // tc ->O(1)
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans = "";
        for(int i=0;i<13;i++){
            int times = num/value[i];
            while(times-->0){
                ans +=symbol[i];
            }
            num= num%value[i];
        }
        return ans;
    }
}
