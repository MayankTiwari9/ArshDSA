package Arrays.Easy;

public class BuyAndSellStock {
    public static int buyAndSell(int[] prices){
        int max = 0;

        int minSoFar = prices[0];

        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            max = Math.max(profit, max);
        }

        // Naive Solution :- TC O(n^2) SC O(1)
        // int cnt = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i+1; j < prices.length; j++) {
        //         if(prices[j] > prices[i]){
        //             cnt = prices[j] - prices[i];
        //             max = Math.max(cnt, max);
        //         }
        //     }
        // }

        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(buyAndSell(prices));
    }
}
