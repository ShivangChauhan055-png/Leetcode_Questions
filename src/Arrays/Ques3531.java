package Arrays;

// Ques3531.java
// Problem Goal:
// Count how many buildings are "covered" from all 4 directions:
//   - A building above (same x, smaller y)
//   - A building below (same x, larger y)
//   - A building on the left (same y, smaller x)
//   - A building on the right (same y, larger x)
//
// A building is covered when ALL 4 exist.

// NOTE:
// The file includes two approaches:
//   1) Brute Force O(n^2)
//   2) Optimized using row/column boundaries O(n)

import java.util.*;

public class Ques3531 {

    // -------------------------------------------------------------------------
    // BRUTE FORCE APPROACH (O(n^2))
    // -------------------------------------------------------------------------
    // IDEA:
    // For each building (x, y):
    //      Scan all other buildings and check:
    //          - Is there someone above   → same x, y smaller
    //          - Is there someone below   → same x, y larger
    //          - Is there someone left    → same y, x smaller
    //          - Is there someone right   → same y, x larger
    //
    // If all four are true → this building is covered.
    //
    public int countCoveredBuildingsBrute(int[][] buildings, int n) {

        int count = 0;

        for (int i = 0; i < buildings.length; i++) {

            // Current building
            int x = buildings[i][0];
            int y = buildings[i][1];

            // Flags for all 4 directions
            boolean top = false;      // building above
            boolean bottom = false;   // building below
            boolean left = false;     // building left
            boolean right = false;    // building right

            // Check every other building
            for (int[] p : buildings) {
                int px = p[0];
                int py = p[1];

                // Above → same column, smaller y
                if (px == x && py < y) top = true;

                // Below → same column, larger y
                if (px == x && py > y) bottom = true;

                // Left → same row, smaller x
                if (py == y && px < x) left = true;

                // Right → same row, larger x
                if (py == y && px > x) right = true;
            }

            // If all four exist → covered
            if (top && bottom && left && right) {
                count++;
            }
        }

        return count;
    }


    // -------------------------------------------------------------------------
    // OPTIMIZED APPROACH (O(n))
    // -------------------------------------------------------------------------
    //
    // Instead of checking all buildings every time,
    // We PRE-COMPUTE boundaries of each row and column.
    //
    // For each row y:
    //      rMin[y] = minimum x (leftmost building)
    //      rMax[y] = maximum x (rightmost building)
    //
    // For each column x:
    //      cMin[x] = minimum y (topmost building)
    //      cMax[x] = maximum y (bottommost building)
    //
    // A building (x, y) is covered only if:
    //      rMin[y] < x < rMax[y]      → there is left & right building
    //      cMin[x] < y < cMax[x]      → there is top & bottom building
    //
    public int countCoveredBuildings(int n, int[][] buildings) {

        int[] rMax = new int[n + 1];
        int[] rMin = new int[n + 1];
        int[] cMax = new int[n + 1];
        int[] cMin = new int[n + 1];

        // Since we are finding min values,
        // initialize them with a very large valid value
        Arrays.fill(rMin, n + 1);
        Arrays.fill(cMin, n + 1);

        // First pass:
        // Build the min/max boundaries for every row & column
        for (int[] p : buildings) {
            int x = p[0];
            int y = p[1];

            // Row boundaries (for buildings in the same y)
            rMax[y] = Math.max(rMax[y], x);
            rMin[y] = Math.min(rMin[y], x);

            // Column boundaries (for buildings in the same x)
            cMax[x] = Math.max(cMax[x], y);
            cMin[x] = Math.min(cMin[x], y);
        }

        int count = 0;

        // Second pass:
        // Check if building is strictly between
        // left-right  AND  top-bottom
        for (int[] p : buildings) {
            int x = p[0];
            int y = p[1];

            boolean hasLeftAndRight  = (x > rMin[y] && x < rMax[y]);
            boolean hasTopAndBottom  = (y > cMin[x] && y < cMax[x]);

            if (hasLeftAndRight && hasTopAndBottom) {
                count++;
            }
        }

        return count;
    }


    // -------------------------------------------------------------------------
    // MAIN (simple testing)
    // -------------------------------------------------------------------------
    public static void main(String[] args) {
        Ques3531 obj = new Ques3531();

        int n = 5;
        int[][] buildings = {
                {2,3}, {1,3}, {4,3},
                {2,1}, {2,5}, {2,4}
        };

        System.out.println("Brute Force Count: " + obj.countCoveredBuildingsBrute(buildings, n));
        System.out.println("Optimized Count: " + obj.countCoveredBuildings(n, buildings));
    }
}

