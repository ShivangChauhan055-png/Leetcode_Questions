package Binary_Search;

public class Ques34 {
/*
Problem: Find First and Last Position of Element in Sorted Array

Simple samajh:
Tujhe ek sorted array diya hai aur ek target diya hai.
Tera kaam hai:
→ target ka first index
→ target ka last index

Agar target nahi milta:
→ [-1, -1] return karna hai

------------------------------------------------------------

APPROACH 1: Brute Force (O(n))

Idea:
→ pura array traverse karo
→ jaha pehli baar target mile = first
→ jaha last baar mile = last

Logic:
first sirf ek baar set hoga
last har baar update hoga

------------------------------------------------------------
*/
    public int[] bruteForce(int[] nums, int target) {
        int first = -1, last = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(first == -1) first = i;
                last = i;
            }
        }

        return new int[]{first, last};
    }
/*
------------------------------------------------------------

APPROACH 2: Lower Bound + Upper Bound (O(log n))
Idea:
→ first = lower bound (first index jaha nums[i] >= target)
→ last = (upper bound - 1)
  jaha upper bound = first index jaha nums[i] > target
Important:
→ agar lower bound pe target nahi mila → answer [-1, -1]

Edge case:
→ agar upper bound -1 aaye → matlab target last tak hai
  to upper bound = n maan lo

------------------------------------------------------------
*/

    public int[] usingBounds(int[] nums, int target) {

        if(nums.length == 0) return new int[]{-1, -1};
        int lb = lowerBound(nums, target);
        if(lb == -1 || lb == nums.length || nums[lb] != target)
            return new int[]{-1, -1};
        int ub = upperBound(nums, target);
        if(ub == -1) ub = nums.length;
        return new int[]{lb, ub - 1};
    }
    public int lowerBound(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int upperBound(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

/*
------------------------------------------------------------
APPROACH 3: Direct Binary Search for First & Last (BEST)

Idea:
→ do baar binary search chala
→ ek first occurrence ke liye
→ ek last occurrence ke liye

First:
→ jab target mile → left side ja (high = mid-1)
Last:
→ jab target mile → right side ja (low = mid+1)

Ye sabse clean aur safe approach hai
------------------------------------------------------------
*/

    public int[] searchRange(int[] nums, int target) {

        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }

    public int firstOccurrence(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid;
                high = mid - 1; // left jao
            } else if(nums[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int lastOccurrence(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid;
                low = mid + 1; // right jao
            } else if(nums[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

/*
------------------------------------------------------------
FINAL SAMJH:

Approach 1:
→ easy but slow (O(n))
Approach 2:
→ lower + upper bound (thoda tricky but powerful)
Approach 3:
→ best and clean (interview favourite)
------------------------------------------------------------
*/
}

