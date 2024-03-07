package org.java.prac;

import java.util.Arrays;

public class CoinChangeProblem {

    // You’re given coins of different denominations and a total amount of money.
    // From that, you need to write a function to compute the fewest number of coins that you need to make up that amount

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 6;

        int result = coinChange(coins, amount);

        if (result == -1) {
            System.out.println("It is not possible to make change for the given amount.");
        } else {
            System.out.println("Minimum number of coins needed: " + result);
        }
    }

    public static int coinChange(int[] coins, int amount) {
        // Initialize an array to store the minimum number of coins for each amount
        int[] dp = new int[amount + 1];

        // Initialize the array with a value greater than any possible number of coins
        Arrays.fill(dp, amount + 1);

        // The minimum number of coins needed to make change for 0 is 0
        dp[0] = 0;

        // Iterate over each coin denomination
        for (int coin : coins) {
            System.out.println("Start");
            // Update the minimum number of coins for each amount
            for (int i = coin; i <= amount; i++) {
                System.out.println(i);
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
            System.out.println("End");
        }

        // If dp[amount] is still greater than amount, no valid combination is found
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
