package Arrays;

// Ques56.java
// Problem: Merge Intervals (LeetCode 56)

/*
Idea simple hai bhai:

1. Pehle intervals ko unke start ke basis par sort karte hain.
   Example:
   [1,3], [2,6], [8,10]

2. Fir ek interval uthate hain (start,end)

3. Agar next interval ka start <= current end
   matlab overlap ho raha hai

4. To end ko extend kar dete hain:
   end = max(end, nextEnd)

5. Jab overlap khatam ho jaye
   to us merged interval ko list me add kar dete hain.

6. Fir next non-overlapping interval se process repeat.

Time Complexity:
Sorting → O(n log n)
Merging → O(n)

Total → O(n log n)
*/

import java.util.*;

public class Ques56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        // Step1: intervals ko start ke basis par sort kar diya
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        // result store karne ke liye list
        List<int[]> ls = new ArrayList<>();
        int i = 0;
        while(i < n){
            // current interval ka start aur end
            int start = intervals[i][0];
            int end = intervals[i][1];
            int j = i + 1;
            // jab tak overlap ho raha hai merge karte jao
            while(j < n && intervals[j][0] <= end){
                // end ko extend karo
                end = Math.max(intervals[j][1], end);

                j++;
            }

            // merged interval add
            ls.add(new int[]{start,end});

            // next non-overlapping interval se start
            i = j;
        }

        // List<int[]> → int[][] conversion
        return ls.toArray(new int[ls.size()][]);
    }
}
