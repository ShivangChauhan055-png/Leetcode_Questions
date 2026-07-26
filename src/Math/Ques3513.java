package Math;

class Ques3513 {
    public int uniqueXorTriplets(int[] nums) {
        // simple approach
        int n = nums.length;
        if(n<=2) return n;
        int mask = 0;
        for(int num : nums){
            mask |=num;
        }
        return mask+1;
    }
}
