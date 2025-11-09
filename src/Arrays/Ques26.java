package Arrays;

import java.util.*;
public class Ques26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};

        if (nums.length == 0) {
            System.out.println("Length = 0");
            return;
        }

        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res] = nums[i];
                res++;
            }
        }

        System.out.println("Number of unique elements: " + res);
    }
}

/*
int res = 1; → Pehla element hamesha unique hota hai.
Loop start from index 1.
Agar current element previous se different hai → store karo nums[res] = nums[i], phir res++.
Loop ke baad:
res = unique elements count
First res elements of array = unique values
 */