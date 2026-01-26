package Arrays;

import java.util.*;

public class Ques1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        // Step 1: Array ko sort kar do
        Arrays.sort(arr);

        // Step 2: Answer store karne ke liye list
        List<List<Integer>> ans = new ArrayList<>();
        // Step 3: Minimum absolute difference nikalna
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
            }
        }
        // Step 4: Jinke difference == min ho, un pairs ko add kar do
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        // Step 5: Final answer return
        return ans;
    }
}

