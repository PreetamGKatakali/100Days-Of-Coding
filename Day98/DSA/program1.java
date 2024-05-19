package Day98.DSA;

import java.util.Arrays;

public class program1 {
    static private int[][] dp;

    static private int solve(int currentInd, int currentTarIn, String s, String t) {
        if (currentTarIn >= t.length()) {
            return 1;
        }
        if (currentInd >= s.length()) {
            return 0;
        }
        if (dp[currentInd][currentTarIn] != -1) {
            return dp[currentInd][currentTarIn];
        }
        int res1 = solve(currentInd + 1, currentTarIn, s, t);
        if (s.charAt(currentInd) == t.charAt(currentTarIn)) {
            res1 += solve(currentInd + 1, currentTarIn + 1, s, t);
        }
        dp[currentInd][currentTarIn] = res1;
        return res1;
    }

    static public int numDistinct(String s, String t) {
        dp = new int[s.length() + 1][t.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, 0, s, t);
    }
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        int result =numDistinct(s, t);
        System.out.println("The number of distinct subsequences is: " + result);
    }
}
