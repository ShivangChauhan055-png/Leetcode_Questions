package Math;

import java.util.*;

class Ques2033 {
    public int minOperations(int[][] grid, int x) {
        /*
        // approach
        first grid ko list bna lege then check kr lege ki uska rem same h ya nhi h
        agr nhi h to -1 becoz fir +-x krke same nhi bna sakte h
        then ls sort kr do median nikal lo and list ke sb ele ko median se subtract krke
        diff nikal lo and diff ko / x kr do operation m add kr do
        */

        ArrayList<Integer> ls = new ArrayList<>();
        for(int[] row : grid){
            for(int l : row){
                ls.add(l);
            }
        }
        int mod = ls.get(0) %x;
        for(int num : ls){
            if(num%x != mod) return -1;
        }
        Collections.sort(ls);
        int median = ls.get(ls.size()/2);
        int op = 0;
        for(int val : ls){
            int diff = Math.abs(val - median);
            op += diff/x;
        }
        return op;
    }
}
