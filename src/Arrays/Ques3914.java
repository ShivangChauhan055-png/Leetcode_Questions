package Arrays;

class Ques3914 {
    public long minOperations(int[] nums) {
        int n = nums.length;
        // Approach 1 (Normal Samajhne wala)
        // Idea:
        // Har element ko previous se compare karo
        // Agar chhota hai → usko bada banana padega (difference add karo)

        /*
        long operation = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i-1]){
                operation += (long)(nums[i-1] - nums[i]);
            }
        }
        return operation;
        */

        // Approach 2 (Short & Smart )
        long op = 0;
        for(int i = 1; i < n; i++){
            op += Math.max(nums[i-1] - nums[i], 0);
        }
        return op;
    }
}
