package Binary_Search;


// Ques540.java
class Ques504 {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        //  edge cases
        // agar sirf 1 element hai
        if (n == 1) return nums[0];
        // agar first element hi unique hai
        if (nums[0] != nums[1]) return nums[0];
        // agar last element hi unique hai
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //  agar mid hi unique hai
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            //  main logic (pattern observation)
            // case 1:
            // odd index pe same left se match kar raha hai
            // ya even index pe right se match kar raha hai
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {

                //  iska matlab unique element RIGHT side me hai
                low = mid + 1;

            } else {
                //  unique element LEFT side me hai
                high = mid - 1;
            }
        }
        return -1;
    }
}

