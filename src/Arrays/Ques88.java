package Arrays;

// Ques88.java
// Problem: Merge Sorted Array (LeetCode 88)

/*
Idea simple hai bhai:

Hume do sorted arrays diye hote hain:

nums1 -> size m (actual elements)
nums2 -> size n

nums1 ka total size m+n hota hai
last ke n positions empty hote hain (0s)

Goal:
nums2 ke elements ko nums1 me merge karke
final sorted array nums1 me hi store karna hai.

Approach (Temporary Array):

1. Ek new array banate hain size m+n ka.
2. Dono arrays ko merge karte hain exactly merge sort jaisa.
3. Jo element chhota hoga usko new array me daal denge.
4. Agar kisi array ke elements khatam ho gaye
   to dusre array ke bache hue elements copy kar denge.
5. End me new array ko nums1 me copy kar denge.

Time Complexity:
O(m + n)

Space Complexity:
O(m + n)
*/

import java.util.*;

class Ques88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // temporary array jisme merged result store hoga
        int[] arr = new int[m+n];
        int left = 0;   // nums1 pointer
        int right = 0;  // nums2 pointer
        int index = 0;  // arr pointer

        // jab tak dono arrays me elements hain
        while(left < m && right < n){
            if(nums1[left] <= nums2[right]){
                arr[index] = nums1[left];
                left++;
                index++;
            }
            else{
                arr[index] = nums2[right];
                right++;
                index++;
            }
        }
        // agar nums1 me elements bache hain
        while(left < m){
            arr[index++] = nums1[left++];
        }
        // agar nums2 me elements bache hain
        while(right < n){
            arr[index++] = nums2[right++];
        }
        // final merged array ko nums1 me copy
        for(int i = 0; i < m+n; i++){
            nums1[i] = arr[i];
        }
    }
}
