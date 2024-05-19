package Day98.DSA;

public class program {
    static public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int[] dpNext = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            dpNext[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dpNext[j] = dp[j - 1] + 2;
                } else {
                    dpNext[j] = Math.max(dp[j], dpNext[j - 1]);
                }
            }
            int[] temp = dp;
            dp = dpNext;
            dpNext = temp;
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println("The length of the longest palindromic subsequence is: " + longestPalindromeSubseq(s));
        
    }
}
