package Arrays;


import java.util.*;

/*
    Ques15.java
    Problem : 3Sum
    Given array nums, find all unique triplets whose sum = 0

    yaha 3 approaches likhe hue hain:
    1 Brute Force
    2 Better using HashSet
    3 Optimal using Two Pointer
*/

public class Ques15 {

    // ================================
    // 1 BRUTE FORCE APPROACH
    // ================================
    // TC → O(n^3 * log(no of triplets))
    // SC → O(no of unique triplets)

    public static List<List<Integer>> threeSumBrute(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> ls = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(ls); // duplicate avoid karne ke liye
                        set.add(ls);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }



    // ================================
    // 2 BETTER APPROACH (HashSet)
    // ================================
    // TC → O(n^2)
    // SC → O(n)

    public static List<List<Integer>> threeSumBetter(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            // har i ke liye ek fresh set
            HashSet<Integer> s = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i] + nums[j]);
                // agar required element already set me hai
                if(s.contains(third)){
                    List<Integer> ls =Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(ls);
                    set.add(ls);
                }
                // j ko set me add karte jaa rahe hain
                s.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }



    // ================================
    // 3 OPTIMAL APPROACH
    // ================================
    // Sorting + Two Pointer
    // TC → O(n^2)
    // SC → O(1) (output ko ignore karke)

    public static List<List<Integer>> threeSumOptimal(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            // duplicate i remove karne ke liye
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++; // sum badhana hai
                }
                else if(sum > 0){
                    right--; // sum kam karna hai
                }
                else{
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // duplicate left skip
                    while(left < right && nums[left]==nums[left-1])
                        left++;
                    // duplicate right skip
                    while(left < right && nums[right]==nums[right+1])
                        right--;
                }
            }
        }
        return ans;
    }



    // ================================
    // MAIN FUNCTION (TEST)
    // ================================
    public static void main(String[] args){

        int nums[] = {-1,0,1,2,-1,-4};

        System.out.println("Brute : " + threeSumBrute(nums));
        System.out.println("Better : " + threeSumBetter(nums));
        System.out.println("Optimal : " + threeSumOptimal(nums));
    }
}


