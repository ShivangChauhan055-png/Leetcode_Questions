package Arrays;

public class Ques189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);      // reverse whole array
        reverse(nums, 0, k - 1);      // reverse first k elements
        reverse(nums, k, n - 1);      // reverse remaining elements
    }

    // function to reverse array part
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Ques189 obj = new Ques189();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
