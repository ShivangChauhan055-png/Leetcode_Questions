package Binary_Search;

public class Ques35 {
/*
Problem: Search Insert Position (Leetcode 35)

 Hume ek sorted array diya hai
 target number diya hai

Case 1:
Agar target mil jata hai → uska index return kar

Case 2:
Agar nahi milta → wo position return kar jaha wo insert hoga
(array sorted hi rehna chahiye)

 Real logic:
Ye basically LOWER BOUND hai
→ first index jaha nums[i] >= target

Example:
nums = [1,3,5,6], target = 2
answer = 1 (kyunki 3 se pehle aayega)

--------------------------------------------------
Approach (Binary Search):

1. low = 0, high = n-1
2. ans = n (default maan lo last me jayega)
3. mid nikaal
4. Agar nums[mid] >= target:
      → possible answer mil gaya
      → left side me aur chota index dhundo
5. warna right side jao
--------------------------------------------------
*/
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n; // default: agar sabse bada hua to end me jayega
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // agar mid pe value >= target hai
            if (nums[mid] >= target) {
                ans = mid;        // ye ek valid position hai
                high = mid - 1;  // aur left me try karte hain (first occurrence)
            } else {
                low = mid + 1;   // right side jao
            }
        }
        return ans;
    }
    // testing ke liye main method
    public static void main(String[] args) {
        Ques35 obj = new Ques35();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = obj.searchInsert(nums, target);
        System.out.println("Insert position: " + result);
    }
}

