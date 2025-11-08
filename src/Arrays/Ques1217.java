package Arrays;

public class Ques1217 {
    public static void main(String[] args) {
        int[] position = {2,2, 2, 3,3};

        int result = minCostToMoveChips(position);
        System.out.println(result);
    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;

        // Count how many chips are on even and odd positions
        for (int n : position) {
            if (n % 2 == 0) even++;
            else odd++;
        }
        // Minimum cost = move the smaller group to the other side
        return Math.min(even, odd);
    }
}
