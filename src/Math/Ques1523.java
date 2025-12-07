package Math;

// Ques1523.java
// LeetCode 1523 : Count Odd Numbers in an Interval Range
// IDEA:
//  -> Range [low ... high] me kitne odd numbers hain count karne hain
//  -> Brute force me loop laga ke check kar sakte h (O(n))
//  -> But optimized logic direct math se answer de sakta h (O(1))
//
// Math Logic (Important):
//  -> total numbers = (high - low + 1)
//  -> Case 1: agar low aur high dono odd hain → extra 1 odd milta hai
//  -> Case 2: otherwise → aadhe numbers odd hote hain

public class Ques1523 {

    public int countOdds(int low, int high) {

        // ---------------- Brute Force Approach ----------------
        // int count = 0;
        // for(int i = low; i <= high; i++) {
        //     if(i % 2 != 0) count++;
        // }
        // return count;
        // ---------------------------------------------------------


        // --------------- Optimized Approach (O(1)) ---------------
        // kitne numbers total present hain
        int totalNums = high - low + 1;

        // agar boundary numbers (low & high) dono odd hain
        // to odd count = total/2 + 1
        if (low % 2 != 0 && high % 2 != 0) {
            return totalNums / 2 + 1;
        }

        // otherwise half numbers odd hote hain
        return totalNums / 2;
    }

    // Optional testing
    public static void main(String[] args) {
        Ques1523 obj = new Ques1523();
        System.out.println(obj.countOdds(3, 7));  // output: 3 (3, 5, 7)
        System.out.println(obj.countOdds(4, 10)); // output: 3 (5, 7, 9)
        System.out.println(obj.countOdds(2, 2));  // output: 0
    }
}

