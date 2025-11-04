package Arrays;

public class Ques55 {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) return false; // agar i reachable nahi hai
            reach = Math.max(reach, i + nums[i]); // maximum reach update karo
        }
        return true;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Ques55 obj = new Ques55();

        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println("Test 1: " + obj.canJump(nums1));
        System.out.println("Test 2: " + obj.canJump(nums2));
    }
}
