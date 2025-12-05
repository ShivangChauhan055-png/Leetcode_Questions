package Arrays;

// Ques3432.java
// IDEA:
// Hume array ko beech me partition karna hai (left + right)
// Aur count karna hai kitni partitions me:
//   left sum ka parity  == right sum ka parity
// (parity = odd/even nature)
//
// Logic:
// 1) Total sum nikalo (ans)
// 2) i = 0 se n-2 tak iterate
//    left sum update karo
//    right sum = total - left
//    agar left%2 == right%2 -> count++
//
// Why n-2? because at least 1 element left/right required.
// TC: O(n), SC: O(1)

public class Ques3432 {

    public int countPartitions(int[] nums) {

        // Step 1: total sum of array (right part ke liye use hoga)
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        // left part ka running sum
        int leftSum = 0;
        int count = 0;

        // Step 2: har index par partition try karo (last index se pehle tak)
        for (int i = 0; i < nums.length - 1; i++) {

            leftSum += nums[i];       // left part update
            int rightSum = totalSum - leftSum;  // right part

            // parity check
            // left even & right even  → same
            // left odd  & right odd   → same
            if ((leftSum % 2) == (rightSum % 2)) {
                count++;
            }
        }

        return count;
    }

    // optional testing
    public static void main(String[] args) {
        Ques3432 obj = new Ques3432();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(obj.countPartitions(nums1)); // Example output: ?

        int[] nums2 = {2, 2, 2};
        System.out.println(obj.countPartitions(nums2)); // parity example
    }
}

