package Math;

// Ques1828.java
// Problem: LeetCode 1828 - Queries on Number of Points Inside a Circle

/*
Idea simple hai bhai:

Hume points diye hain (x,y)
Aur queries di hain jisme:
(x , y , r) → circle ka center aur radius

Har query ke liye hume count karna hai:
kitne points us circle ke andar aate hain

------------------------------------

Math logic:

Distance formula:
distance² = (x1 - x2)² + (y1 - y2)²

Agar:
distance² <= r²
to point circle ke andar hai

Note:
sqrt lene ki zarurat nahi hai
direct square compare karte hain → fast

------------------------------------

Steps:

1. Har query uthao
2. Uska center (x,y) aur radius r nikalo
3. Har point ke liye check karo:
   (x - px)² + (y - py)² <= r²
4. Agar condition true → count++
5. Har query ka answer array me store karo

------------------------------------

Time Complexity:
O(Q × N)

Q = queries
N = points
*/

class Ques1828 {

    public int[] countPoints(int[][] points, int[][] queries) {

        int n = queries.length;
        // result array
        int[] arr = new int[n];
        // har query ke liye
        for(int i = 0; i < n; i++){

            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];

            int count = 0;

            // sab points check karo
            for(int[] a : points){
                int dis_x = x - a[0];
                int dis_y = y - a[1];

                // distance² <= r²
                if(dis_x * dis_x + dis_y * dis_y <= r * r){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
