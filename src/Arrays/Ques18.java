package Arrays;
import java.util.*;

/*
    Ques18.java
    Problem : 4Sum
    Given an array nums[] aur ek target.
    Hume sare unique quadruplets find karne hain jinka sum = target ho.
    Quadruplet form:
        nums[i] + nums[j] + nums[k] + nums[l] = target

    i, j, k, l sabke index different hone chahiye.
    ---------------------------------------------------------
    Approach 1 : Brute Force
    ---------------------------------------------------------
    4 loops chalate hain aur har combination check karte hain.

    TC = O(n^4)
    SC = O(no. of unique quadruplets)

    duplicate avoid karne ke liye Set use karte hain.

    ---------------------------------------------------------
    Approach 2 : Optimal (Sorting + Two Pointer)
    ---------------------------------------------------------

    Steps:
    1. Array sort karo
    2. Pehla element fix karo (i loop)
    3. Dusra element fix karo (j loop)
    4. Baaki 2 elements ke liye two pointer lagao

    left = j+1
    right = n-1

    sum = nums[i] + nums[j] + nums[left] + nums[right]

    agar sum == target → answer mil gaya
    agar sum < target → left++
    agar sum > target → right--

    duplicate avoid karne ke liye
    i, j, left, right sabke duplicates skip karte hain.
    TC = O(n^3)
    SC = O(1) (output ko ignore karke)
*/
public class Ques18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        // Step 1 : sort array
        Arrays.sort(nums);
        // Step 2 : first element fix
        for(int i = 0; i < n; i++){
            // duplicate avoid for i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            // Step 3 : second element fix
            for(int j = i+1; j < n; j++){
                // duplicate avoid for j
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int left = j + 1;
                int right = n - 1;
                // Step 4 : two pointer
                while(left < right){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // duplicate remove for left
                        while(left < right && nums[left] == nums[left+1])
                            left++;
                        // duplicate remove for right
                        while(left < right && nums[right] == nums[right-1])
                            right--;
                        left++;
                        right--;
                    }
                    else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }


    // testing
    public static void main(String[] args) {

        int nums[] = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> ans = fourSum(nums, target);

        System.out.println(ans);
    }
}


