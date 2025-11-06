package Arrays;

import java.util.*;
public class Ques1389 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        List<Integer> list = new ArrayList<>();

        // Step 1: Insert elements at given index positions
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        // Step 2: Convert list to array
        int[] result = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        // Step 3: Print final result
        System.out.println(Arrays.toString(result));
    }

}
