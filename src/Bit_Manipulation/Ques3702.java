package Bit_Manipulation;

class Ques3702 {
    public int longestSubsequence(int[] nums) {
        // simple observation
        // if totalxor == 0 return n-1 , totalxor !=0 reutrn n
        // 1 edge case if whole array is 0,0,0,0 for that we have to check manually

        int n = nums.length;
        int totalXor = 0;
        boolean allZero = true; // edge case
        for(int c : nums){
            totalXor ^= c;
            if(c!=0) allZero = false;
        }
        if(allZero) return 0; // if all the ele are zero then return 0;
        return totalXor == 0 ? n-1 : n;
    }
}
