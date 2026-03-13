package Arrays;

// Ques452.java
// Problem: Minimum Number of Arrows to Burst Balloons (LeetCode 452)

/*
Idea simple hai

Har balloon ek interval hai:
[start , end]

Agar arrow kisi position x par shoot karo aur
start <= x <= end
toh balloon burst ho jayega.

Goal:
Minimum arrows me sab balloons burst karna.

Approach (Greedy):

1. Sab balloons ko end ke basis par sort karte hain.
   Kyuki jo balloon sabse jaldi khatam ho raha hai
   uske end par arrow shoot karna best choice hota hai.

2. First balloon ke end par arrow shoot kar dete hain.

3. Fir next balloons check karte hain:
   - Agar next balloon ka start <= current end
     matlab woh same arrow se burst ho jayega.

   - Agar start > end
     matlab naya arrow chahiye.

4. Jab naya arrow chahiye ho
   to arrow++ kar dete hain
   aur end update kar dete hain.

Time Complexity:
Sorting  → O(n log n)
Traversal → O(n)

Total → O(n log n)
*/

import java.util.*;

class Ques452 {

    public int findMinArrowShots(int[][] points) {

        // Step1: balloons ko end ke basis par sort
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        // kam se kam 1 arrow to lagega
        int arrow = 1;
        // first balloon ke end par arrow shoot
        int end = points[0][1];

        for(int i = 1; i < points.length; i++){
            // agar next balloon ka start current arrow ke range se bahar hai
            if(points[i][0] > end){
                // new arrow chahiye
                arrow++;
                // new arrow iss balloon ke end par shoot
                end = points[i][1];
            }
        }
        return arrow;
    }
}
