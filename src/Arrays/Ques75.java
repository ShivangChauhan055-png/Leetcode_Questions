package Arrays;

import java.util.Arrays;

public class Ques75 {

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        Solution s = new Solution();

        // Choose any approach by uncommenting:

        // s.sortColorsBrute(nums);
        // s.sortColorsBetter(nums);
        s.sortColorsBest(nums);

        System.out.println(Arrays.toString(nums));
    }
}

class Solution {

    // =========================
    // Approach 1 : Brute Force (O nlogn)
    // =========================
    public void sortColorsBrute(int[] nums) {
        Arrays.sort(nums);
    }

    // =========================
    // Approach 2 : Better (Counting)  O(2n)
    // YOUR ORIGINAL CODE
    // =========================
    public void sortColorsBetter(int[] nums) {

        int count0 =0,count1=0,count2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count0++;
            else if(nums[i]==1) count1++;
            else count2++;
        }

        for(int i =0;i<count0;i++){
            nums[i]=0;
        }

        for(int i =count0;i<count0+count1;i++){
            nums[i]=1;
        }

        for(int i=count0+count1;i<nums.length;i++){
            nums[i]=2;
        }
    }

    // =========================
    // Approach 3 : Best (Dutch National Flag) O(n)
    // =========================
    public void sortColorsBest(int[] nums) {

        int low =0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){

            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }

            else if(nums[mid]==1) mid++;

            else{
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}

