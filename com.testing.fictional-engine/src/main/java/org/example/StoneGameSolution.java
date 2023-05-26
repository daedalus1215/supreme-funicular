package org.example;

public class StoneGameSolution {
    public static void main(String[] args) {


    }

    public static int stoneGameI(int[] piles) {
        if (piles.length == 0) return 0;
        int[] suffixSum = new int[piles.length];
        suffixSum[piles.length -1] = piles[piles.length -1];
        for (int i = piles.length -2; i>= 0; --i) {
            suffixSum[i] = piles[i];
        }
        return helper(piles, suffixSum, 0, 1);
    }

    static int helper(int[] piles, int[] suffixSum, int i, int m) {
        if (i == piles.length) return 0;
        if (i + 2 * m >= piles.length) return suffixSum[i];

        int result = 0;
        for (int x = 1; x <= 2 * m; ++x) {
            result = Math.max(result, suffixSum[i] - helper(piles, suffixSum, i+ x, Math.max(m, x)));
        }
        return result;
    }
}