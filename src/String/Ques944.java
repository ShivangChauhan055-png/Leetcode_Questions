package String;

// Ques944.java
// LeetCode 944 : Delete Columns to Make Sorted
// Approach: Column-wise traversal + greedy check

public class Ques944 {

    // Ye function minimum columns count karta hai
    // jinhe delete karna padega taaki
    // har column top se bottom tak sorted ho
    public int minDeletionSize(String[] strs) {

        // Total rows = strings ki count
        int rows = strs.length;

        // Total columns = har string ki length (same hoti hai)
        int cols = strs[0].length();

        int deletions = 0; // kitni columns delete karni hain

        // Har column ko ek-ek karke check karenge
        for (int c = 0; c < cols; c++) {

            // Har column me rows ko top se bottom compare karenge
            for (int r = 0; r < rows - 1; r++) {

                // Agar upar wali string ka character
                // neeche wali string ke character se bada ho gaya
                // matlab column sorted nahi hai
                if (strs[r].charAt(c) > strs[r + 1].charAt(c)) {

                    // Is column ko delete karna padega
                    deletions++;

                    // Is column ke liye aage check karne ki zarurat nahi
                    break;
                }
            }
        }

        // Total deletions return
        return deletions;
    }

    // (Optional) main method testing ke liye
    public static void main(String[] args) {
        Ques944 obj = new Ques944();

        String[] strs1 = {"cba", "daf", "ghi"};
        System.out.println(obj.minDeletionSize(strs1)); // Output: 1

        String[] strs2 = {"a", "b"};
        System.out.println(obj.minDeletionSize(strs2)); // Output: 0

        String[] strs3 = {"zyx", "wvu", "tsr"};
        System.out.println(obj.minDeletionSize(strs3)); // Output: 3
    }
}

