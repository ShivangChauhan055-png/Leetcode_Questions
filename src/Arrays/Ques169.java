
import java.util.*;

/*
    Ques169.java
    Problem : Majority Element

    Majority element wo element hota hai jo
    array me n/2 se zyada baar aata ho.

    Example:
    Input  : [2,2,1,1,1,2,2]
    Output : 2
*/

public class Ques169 {

    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};

        // koi bhi approach call kar sakte ho
        // System.out.println(majorityElementBrute(arr));
        System.out.println(majorityElementBest(arr));
    }


    // =================================
    // Approach 1 : Brute Force
    // =================================
    // har element ka frequency check karte hain

    // TC : O(n*n)
    // SC : O(1)

    public static int majorityElementBrute(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n; i++){

            int count = 0;

            for(int j = 0; j < n; j++){

                if(arr[i] == arr[j])
                    count++;
            }

            if(count > n/2)
                return arr[i];
        }

        return -1;
    }



    // =================================
    // Approach 2 : Moore’s Voting Algorithm
    // =================================
    // TC : O(n)
    // SC : O(1)

    public static int majorityElementBest(int[] arr){

        int n = arr.length;

        int ele = 0;
        int count = 0;

        // candidate find karte hain
        for(int i = 0; i < n; i++){

            if(count == 0)
                ele = arr[i];

            if(arr[i] == ele)
                count++;

            else
                count--;
        }

        // verification step
        int freq = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] == ele)
                freq++;
        }

        if(freq > n/2)
            return ele;

        else
            return -1;
    }
}

