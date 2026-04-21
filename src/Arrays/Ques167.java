package Arrays;

/*
File: Ques167.java
Problem: Two Sum II - Input Array Is Sorted
*/

class Ques167 {
    public int[] twoSum(int[] numbers, int target) {

        // ==============================
        // Approach 1: Brute Force
        // ==============================
    /*
    Idea:
    - Har element ko uthao (i)
    - Uske baad sab elements ke saath check karo (j)
    - Dekho koi pair mil raha hai kya jiska sum = target

    Example:
    [2,7,11,15], target = 9

    i=0 → 2
        j=1 → 2+7=9 mil gaya

    Problem:
    - Har pair check karna padta hai
    - Time lagta hai → O(n^2)

    Space: O(1)
    */

    /*
    int n = numbers.length;
    for(int i=0;i<n;i++){
        for(int j = i+1;j<n;j++){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
        }
    }
    return new int[]{-1,-1};
    */


        // ==============================
        // Approach 2: Two Pointer (Optimized)
        // ==============================

    /*
    Idea:

    - Array sorted hai
    - Left pointer start se
    - Right pointer end se

    Logic:

    sum = numbers[left] + numbers[right]
    - agar sum bada hai → right--
    - agar sum chhota hai → left++
    - agar equal → answer mil gaya

    Example:
    [2,7,11,15], target = 9

    left=0 (2), right=3 (15)
    sum=17 > 9 → right--
    left=0 (2), right=2 (11)
    sum=13 > 9 → right--
    left=0 (2), right=1 (7)
    sum=9 mil gaya
    Time: O(n)
    Space: O(1)
    */
        int left = 0, right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1}; // 1-based index
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}

