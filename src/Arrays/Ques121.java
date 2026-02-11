package Arrays;

import java.util.*;

public class Ques121 {

    static class Solution {
        public int maxProfit(int[] prices) {
            int mini = prices[0];   // ab tak ka minimum price
            int profit = 0;        // maximum profit
            for (int i = 1; i < prices.length; i++) {
                int cost = prices[i] - mini;   // aaj bechne ka profit
                profit = Math.max(profit, cost); // best profit update
                mini = Math.min(mini, prices[i]); // minimum buy price update
            }
            return profit;
        }
    }
    // Driver code
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("Maximum Profit = " + sol.maxProfit(prices));
    }
}
