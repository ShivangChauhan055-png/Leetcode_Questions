package Arrays;

public class Ques1672 {

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        int result = maximumWealth(accounts);
        System.out.println("Richest customer's wealth is: " + result);
    }

    // static method banaya taaki directly main() se call ho sake
    public static int maximumWealth(int[][] accounts) {
        int r = 0; // r = richest wealth (maximum so far)

        for (int[] i : accounts) {  // har customer (row) ke liye
            int sum = 0;            // us customer ka total wealth
            for (int m : i) {       // har bank account ka paisa jod lo
                sum += m;
            }
            r = Math.max(r, sum);   // check karo ye customer richest hai kya
        }
        return r; // final richest customer ka wealth return karo
    }
}

