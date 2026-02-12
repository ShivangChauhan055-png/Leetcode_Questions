package Arrays;

// Ques2149.java
// Rearrange Array Elements by Sign (LeetCode 2149)

class Ques2149 {

    public int[] rearrangeArray(int[] nums) {

        //  Brute force approach (commented)
        // Pehle positives aur negatives alag ArrayList me daalo
        // fir even index pe positive aur odd index pe negative
        // TC = O(n+n), SC = O(n)

        /*
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i] = pos.get(i);      // even index → positive
            nums[2*i+1] = neg.get(i);  // odd index → negative
        }
        return nums;
        */
        //  Optimized approach
        // TC = O(n)
        // SC = O(n)
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0;   // even index
        int neg = 1;   // odd index
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                ans[neg] = nums[i];
                neg += 2;        // next odd position
            }else{
                ans[pos] = nums[i];
                pos += 2;        // next even position
            }
        }
        return ans;
    }
}

