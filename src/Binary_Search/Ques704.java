package Binary_Search;

import java.util.*;

/*
    Ques704.java
    Problem : Binary Search
    Given sorted array nums[]
    target find karna hai
    agar mil jaye → index return
    warna → -1
    -----------------------------------------
    Approach 1 : Iterative Binary Search
    -----------------------------------------
    Idea:
    array sorted hai

    mid nikalte hain:
        mid = (low + high) / 2
    agar target == nums[mid]
        → mil gaya
    agar target > nums[mid]
        → right side me jao
    agar target < nums[mid]
        → left side me jao
    -----------------------------------------
    Approach 2 : Recursion
    -----------------------------------------
    same logic but function ko recursively call karte hain
*/

public class Ques704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        // iterative
        System.out.println(searchIterative(nums, target));
        // recursive
        System.out.println(searchRecursive(nums, target));
    }


    // =========================================
    // Approach 1 : Iterative
    // =========================================
    public static int searchIterative(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            // mil gaya
            if(nums[mid] == target)
                return mid;
                // right side
            else if(target > nums[mid])
                low = mid + 1;
                // left side
            else
                high = mid - 1;
        }
        return -1;
    }


    // =========================================
    // Approach 2 : Recursive
    // =========================================
    public static int searchRecursive(int[] nums, int target){
        return bs(nums, 0, nums.length - 1, target);
    }
    public static int bs(int[] nums, int low, int high, int target){
        // base case
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(nums[mid] == target)
            return mid;
            // right side
        else if(target > nums[mid])
            return bs(nums, mid + 1, high, target);
            // left side
        else
            return bs(nums, low, mid - 1, target);
    }
}


