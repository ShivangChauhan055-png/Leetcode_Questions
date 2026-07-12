package Arrays;

import java.util.*;
class Ques1331 {
    public int[] arrayRankTransform(int[] arr) {
        // simple approach
        /*
        array to clone kro,sort kro and map m rank store kr lo then return kr do rank
        */
        int n = arr.length;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> mp = new HashMap<>();
        int rank  = 1;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            if(i>0 && temp[i]>temp[i-1]) rank++;
            mp.put(temp[i],rank);
        }
        for(int i=0;i<n;i++){
            result[i] = mp.get(arr[i]);
        }
        return result;
    }
}
