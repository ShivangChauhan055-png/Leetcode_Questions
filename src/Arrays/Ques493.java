package Arrays;

import java.util.*;

public class Ques493 {
    //  BRUTE FORCE (O(n^2))
    // simple logic: har pair check karo
    public static int reversePairsBrute(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                // nums[i] > 2 * nums[j]
                if(nums[i] > 2L * nums[j]) { // 2L overflow avoid karega
                    count++;
                }
            }
        }
        return count;
    }

    //  OPTIMIZED (Merge Sort - O(n log n))
    public static int reversePairsOptimal(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    // divide + conquer
    static int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low < high){
            int mid = (low + high) / 2;
            // left side
            count += mergeSort(nums, low, mid);
            // right side
            count += mergeSort(nums, mid + 1, high);
            //  important step (yaha pairs count hote hain)
            count += countPair(nums, low, mid, high);
            // merge karna (sorting maintain karne ke liye)
            merge(nums, low, mid, high);
        }
        return count;
    }
    //  yaha actual logic hai
    static int countPair(int[] nums, int low, int mid, int high){
        int count = 0;
        int j = mid + 1;
        for(int i = low; i <= mid; i++){
            // jab tak condition satisfy ho rahi hai
            while(j <= high && nums[i] > 2L * nums[j]) {
                j++;
            }
            // jitne valid j mile → utne pairs
            count += (j - (mid + 1));
        }
        return count;
    }
    // normal merge (sorting)
    static void merge(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);
            }
        }
        while(left <= mid) temp.add(nums[left++]);
        while(right <= high) temp.add(nums[right++]);
        // copy back
        for(int i = low; i <= high; i++){
            nums[i] = temp.get(i - low);
        }
    }
    //  MAIN FUNCTION (TEST)
    public static void main(String[] args) {
        int[] arr1 = {1,3,2,3,1};
        int[] arr2 = arr1.clone(); // same array for both

        System.out.println("Brute Answer: " + reversePairsBrute(arr1));
        System.out.println("Optimal Answer: " + reversePairsOptimal(arr2));
    }
}