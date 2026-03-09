
import java.util.*;

/*
    Ques3719.java
    Problem : Longest Balanced Subarray

    Hume array diya hai.
    Hume longest subarray find karna hai jisme

        unique even numbers == unique odd numbers

    Example:
    nums = [2,3,4,5]

    Possible subarrays:

    [2]          → even=1 odd=0
    [2,3]        → even=1 odd=1
    [2,3,4]      → even=2 odd=1
    [2,3,4,5]    → even=2 odd=2

    Longest length = 4
*/

public class Ques3719 {

    public static void main(String[] args) {

        int[] nums = {2,3,4,5};

        System.out.println(longestBalanced(nums));
    }


    // ======================================
    // Brute Force Approach
    // ======================================
    // TC : O(n²)
    // SC : O(n)

    public static int longestBalanced(int[] nums){

        int max = 0;

        // starting index fix karte hain
        for(int i = 0; i < nums.length; i++){

            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();

            // subarray extend karte hain
            for(int j = i; j < nums.length; j++){

                // even number
                if(nums[j] % 2 == 0){
                    even.add(nums[j]);
                }

                // odd number
                else{
                    odd.add(nums[j]);
                }

                // agar even unique == odd unique
                if(even.size() == odd.size()){

                    max = Math.max(max , j - i + 1);
                }
            }
        }

        return max;
    }
}
