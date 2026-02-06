package Arrays;

import java.util.*;

public class Ques169 {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        Solution1 s = new Solution1();

        System.out.println(s.majorityElement(arr));
    }
}
class Solution1 {
    int majorityElement(int arr[]) {
        int n = arr.length;
        // =========================
        // Approach 1 : Brute Force  O(n*n)
        // =========================
        /*
        for(int i =0;i<n;i++){
            int count =1;
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>n/2) return arr[i];
        }
        return -1;
        */

        // =========================
        // Approach 2 : Moore’s Voting Algorithm  O(n)
        // =========================

        int ele = 0, count = 0;
        for(int i=0;i<n;i++){
            if(count==0) ele = arr[i];

            if(arr[i]==ele) count++;
            else count--;
        }
        // verification step
        int f = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele) f++;
        }
        if(f > n/2) return ele;
        else return -1;
    }
}

