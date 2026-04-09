package Arrays;

class Ques45 {
    public int jump(int[] nums) {
        int n = nums.length;
        // current = current range ka end (jitna cover ho chuka hai)
        int current = 0;
        // far = next range me maximum kaha tak ja sakte hain
        int far = 0;
        // jump = minimum jumps count
        int jump = 0;

        for(int i = 0; i < n - 1; i++){
            // har index se max reach update karo
            far = Math.max(far, i + nums[i]);

            // agar current range khatam ho gayi
            if(i == current){
                jump++;          // ek jump liya
                current = far;   // new range set
            }
        }
        return jump;
    }
}