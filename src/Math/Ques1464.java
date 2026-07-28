package Math;

class Ques1464 {
    public int maxProduct(int[] nums) {
        // // simple direct apply
        // int n =nums.length;
        // int ans = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         ans = Math.max(ans,(nums[i]-1)*(nums[j]-1));
        //     }
        // }
        // return ans;

        // approach 2
        int max1 =0,max2=0;
        for(int n : nums){
            if(n>max1){
                max2 = max1;
                max1 = n;
            }else if(n>max2){
                max2 = n;
            }
        }
        return (max1-1)*(max2-1);
    }
}
