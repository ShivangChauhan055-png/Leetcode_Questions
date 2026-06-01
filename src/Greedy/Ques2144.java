package Greedy;

import java.util.*;
class Ques2144 {
    public int minimumCost(int[] cost) {
        // array ko sort krne ke baad hmm each 3rd ele ko skip kr rhe h for free
        Arrays.sort(cost);
        int count =0;
        int ans = 0;
        int n = cost.length;
        // for(int i=n-1;i>=0;i--){
        //     count++;
        //     if(count==3){
        //         count=0;
        //         continue;
        //     }
        //     ans+=cost[i];
        // }
        // return ans;

        for(int i =n-1;i>=0;i--){
            if((n-1-i)%3 !=2) ans+=cost[i];
        }
        return ans;
    }
}
