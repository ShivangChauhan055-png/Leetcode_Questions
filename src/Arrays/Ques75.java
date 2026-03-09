
import java.util.Arrays;

/*
    Ques75.java
    Problem : Sort Colors

    Array me sirf 3 numbers hote hain:
    0, 1, 2

    Goal:
    Array ko sort karna hai.

    Example:
    Input  : [2,0,2,1,1,0]
    Output : [0,0,1,1,2,2]

    Yaha 3 approaches likhe hain:
    1) Brute Force
    2) Counting
    3) Dutch National Flag (Best)
*/

public class Ques75 {

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        // koi bhi method call kar sakte ho
        // sortColorsBrute(nums);
        // sortColorsBetter(nums);
        sortColorsBest(nums);

        System.out.println(Arrays.toString(nums));
    }


    // =========================
    // Approach 1 : Brute Force
    // =========================
    // direct built-in sort use kar lo

    public static void sortColorsBrute(int[] nums){

        Arrays.sort(nums);
    }



    // =========================
    // Approach 2 : Counting
    // =========================
    // pehle count karte hain
    // kitne 0, kitne 1, kitne 2

    public static void sortColorsBetter(int[] nums){

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // counting
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0) count0++;
            else if(nums[i]==1) count1++;
            else count2++;
        }

        // array fill

        for(int i=0;i<count0;i++)
            nums[i]=0;

        for(int i=count0;i<count0+count1;i++)
            nums[i]=1;

        for(int i=count0+count1;i<nums.length;i++)
            nums[i]=2;
    }



    // =========================
    // Approach 3 : Best
    // Dutch National Flag
    // =========================

    public static void sortColorsBest(int[] nums){

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){

            // case 1 : element 0
            if(nums[mid]==0){

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            // case 2 : element 1
            else if(nums[mid]==1){

                mid++;
            }

            // case 3 : element 2
            else{

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}

