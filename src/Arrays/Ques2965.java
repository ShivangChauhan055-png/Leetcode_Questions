package Arrays;

import java.util.*;

class Ques2965 {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // grid ka size n x n hai
        int n = grid.length;
        // total numbers hone chahiye 1 se n*n tak
        int size = n * n;
        // freq array bana liya (1-based indexing ke liye size+1)
        int[] freq = new int[size + 1];
        int repeat = -1, miss = -1;
        // step 1: frequency count kar lo
        for(int[] row : grid){
            for(int x : row){
                freq[x]++;
            }
        }
        // step 2: check karo kaunsa number missing hai aur kaunsa repeat
        for(int x = 1; x <= size; x++){
            if(freq[x] == 2){
                repeat = x;   // jo 2 baar aaya wo duplicate
            }
            else if(freq[x] == 0){
                miss = x;     // jo aaya hi nahi wo missing
            }
        }
        // return format: [repeating, missing]
        return new int[]{repeat, miss};
    }
}
