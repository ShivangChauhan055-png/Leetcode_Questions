package Arrays;

// Ques349.java
// Question 349: Intersection of Two Arrays
// IDEA:
// nums1 ke saare elements ko Set me daalenge taaki O(1) me check ho.
// nums2 ke elements ko iterate karke check karenge ki nums1 me present hai ya nahi.
// Agar present hai to ans Set me daal denge (unique values).
// Last me Set ko array me convert karke return karenge.
// Time Complexity : O(n + m)
//Space complexity : O(n) or O(n+k)

import java.util.*;

public class Ques349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        // nums1 ke unique elements store karega
        Set<Integer> set = new HashSet<>();

        // final intersection unique elements
        Set<Integer> ans = new HashSet<>();

        // nums1 ke saare elements add kar diye
        for (int x : nums1) {
            set.add(x);
        }

        // nums2 traverse karke check kiyaa -> nums1 me hai to ans me add
        for (int y : nums2) {
            if (set.contains(y)) {
                ans.add(y);
            }
        }

        // Set -> array conversion
        int[] result = new int[ans.size()];
        int i = 0;
        for (int val : ans) {
            result[i++] = val;
        }

        return result;
    }

    // Testing purpose (optional)
    public static void main(String[] args) {
        Ques349 obj = new Ques349();

        int[] nums1 = {1, 2, 2, 5,4,6};
        int[] nums2 = {2, 2,3,4,5,6};

        int[] ans = obj.intersection(nums1, nums2);

        System.out.println(Arrays.toString(ans));  // Output: [2]
    }
}

