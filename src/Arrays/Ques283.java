package Arrays;

public class Ques283 {

    /*
// IDEA:
// Zero ko peeche bhejna h aur non-zero ko aage lana h
// Two pointer use karte h → i traversal pointer, j non-zero ko
// correct position par place karega
// Jab bhi nums[i] non-zero mile → swap nums[i] & nums[j], fir j++
     */
    public void moveZeroes(int[] nums) {
        int j = 0; // j hamesha next non-zero ki correct jagah ko point karega

        for (int i = 0; i < nums.length; i++) {
            // non-zero element mila to swap kar denge
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Ques283 sol = new Ques283();

        int[] arr = {0, 1, 0, 3, 12};
        sol.moveZeroes(arr);

        // Printing result
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

