package Arrays;

class Ques2078 {
    public int maxDistance(int[] colors) {
        // simple brute force tc --> O(n*n)
        // int n = colors.length;
        // int ans = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(colors[i]!=colors[j]){
        //             ans = Math.max(ans , Math.abs(i-j));
        //         }
        //     }
        // }
        // return ans;


        // optimized one tc -->O(n)
        // 0-th and (n-1)th house fix kr do and compare kr lo
        int n = colors.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            // colors[0] fix kr diya and full array se conpare kr rhe jo not equal hua uska max le liya
            if(colors[i]!=colors[0]){
                ans = Math.max(ans,i);
            }
            // colors[n-1] fix kr diya and same unequal hua to max nikal diya
            if(colors[i]!=colors[n-1]){
                ans = Math.max(ans,n-1-i);
            }
        }
        return ans;
    }
}
