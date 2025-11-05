package Arrays;

import java.util.*;
public class Ques1365 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] count = new int[101];
        int[] res = new int[nums.length];

        // Step 1: Count frequency of each number
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Step 2: Prefix sum to know how many numbers are smaller than current
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Fill result array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        // Step 4: Print final result
        System.out.println(Arrays.toString(res));

        //SIMPLE APPROACH..

      //  int[] answer = new int[nums.length];
//         int count;
//         for(int i=0; i<nums.length; i++) {
//             count = 0;
//             for(int j=0; j<nums.length; j++) {
//                 if(i!=j && nums[j] < nums[i])
//                     count++;
//             }
//             answer[i] = count;
//         }
//         return answer;


    }
}
