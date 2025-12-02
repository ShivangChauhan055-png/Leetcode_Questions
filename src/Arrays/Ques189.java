package Arrays;

// Ques189.java
// LeetCode 189. Rotate Array
// Dono approach: 1) Brute Force (extra space) 2) Reverse Method (O(1) space)
// Language: Tumhari explaining style + clean IntelliJ format

import java.util.Arrays;

public class Ques189 {

    // -------------------- Brute Force Approach --------------------
    // IDEA:
    // 1) Last k elements ko temp me store
    // 2) Baaki elements ko right shift karo
    // 3) Temp wale element front me daal do
    // Time: O(n), Space: O(k)
    public static void rotateBrute(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];

        // Step 1: last k elements store
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Step 2: baki elements ko right shift
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Step 3: temp ko front me daal do
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }


    // -------------------- Reverse Method (Optimal) --------------------
    // IDEA:
    // Right rotate by k = reverse full → reverse first k → reverse remaining
    // Example:
    // [1,2,3,4,5,6,7], k=3
    // Step1: reverse full → [7,6,5,4,3,2,1]
    // Step2: reverse first k → [5,6,7,4,3,2,1]
    // Step3: reverse rest → [5,6,7,1,2,3,4]
    // Time: O(n), Space: O(1)
    public static void rotateReverse(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Step 1: reverse full array
        reverse(nums, 0, n - 1);

        // Step 2: reverse first k
        reverse(nums, 0, k - 1);

        // Step 3: reverse remaining n-k
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse array in-place
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


    // -------------------- MAIN for Testing --------------------
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateBrute(arr1, k);
        System.out.println("Brute Force Output : " + Arrays.toString(arr1));

        rotateReverse(arr2, k);
        System.out.println("Reverse Method Output : " + Arrays.toString(arr2));
    }
}
