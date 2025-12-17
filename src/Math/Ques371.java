package Math;

// Ques371.java
// LeetCode 371 : Sum of Two Integers
// Constraint: '+' aur '-' operators use nahi karne

public class Ques371 {

    // Ye function bina + ya - use kiye
    // do integers ka sum nikalta hai
    public int getSum(int a, int b) {

        // Jab tak carry bacha hua hai
        while (b != 0) {

            // Step 1:
            // Carry nikalna:
            // a & b -> jahan dono bits 1 hain
            // << 1 -> carry ko next higher bit me shift
            int carry = (a & b) << 1;

            // Step 2:
            // XOR ka use karke bina carry ke sum nikal liya
            // 0^0=0, 1^0=1, 0^1=1, 1^1=0
            a = a ^ b;

            // Step 3:
            // b me carry daal diya
            // ab next iteration me isko add karenge
            b = carry;
        }

        // Jab carry khatam ho jaye
        // tab a hi final answer hota hai
        return a;
    }

    // (Optional) main method testing ke liye
    public static void main(String[] args) {
        Ques371 obj = new Ques371();

        System.out.println(obj.getSum(3, 5));   // Output: 8
        System.out.println(obj.getSum(-2, 3));  // Output: 1
        System.out.println(obj.getSum(10, 20)); // Output: 30
    }
}

