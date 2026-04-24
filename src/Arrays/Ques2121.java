package Arrays;

import java.util.*;

// LeetCode 2121: Intervals Between Identical Elements
public class Ques2121 {
    //  BRUTE FORCE APPROACH
    // TC: O(n^2), SC: O(1) extra
    // Har index ke liye pura array traverse karke distance nikalte hain
    public static long[] bruteForce(int[] arr) {
        int n = arr.length;
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    sum += Math.abs(i - j);
                }
            }
            ans[i] = sum;
        }
        return ans;
    }

    //  OPTIMIZED APPROACH (Prefix Sum + HashMap)
    // TC: O(n), SC: O(n)
    public static long[] optimized(int[] arr) {
        int n = arr.length;
        long[] ans = new long[n];

        // freq -> kitni baar value aayi
        // sum  -> unke indices ka total sum
        HashMap<Integer, Long> freq = new HashMap<>();
        HashMap<Integer, Long> sum = new HashMap<>();

        //  LEFT PASS
        for (int i = 0; i < n; i++) {
            long f = freq.getOrDefault(arr[i], 0L);
            long s = sum.getOrDefault(arr[i], 0L);

            // Left contribution
            ans[i] += f * i - s;

            // update maps
            freq.put(arr[i], f + 1);
            sum.put(arr[i], s + i);
        }
        // reset for right pass
        freq.clear();
        sum.clear();

        //  RIGHT PASS
        for (int i = n - 1; i >= 0; i--) {
            long f = freq.getOrDefault(arr[i], 0L);
            long s = sum.getOrDefault(arr[i], 0L);

            // Right contribution
            ans[i] += s - f * i;

            // update maps
            freq.put(arr[i], f + 1);
            sum.put(arr[i], s + i);
        }

        return ans;
    }
    //  MAIN FUNCTION (Testing)
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 1, 2};

        System.out.println("Brute Force:");
        System.out.println(Arrays.toString(bruteForce(arr)));

        System.out.println("Optimized:");
        System.out.println(Arrays.toString(optimized(arr)));
    }
}
