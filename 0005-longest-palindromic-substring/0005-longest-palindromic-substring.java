class Solution {
    public String longestPalindrome(String s1) {
        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s2.length();

        int[][] dp = new int[n + 1][n + 1];
        int max = 0;
        int end = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];

                    int start = i - dp[i][j];
                    int revStart = n - j;

                    if (start == revStart && max < dp[i][j]) {
                        max = dp[i][j];
                        end = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return s1.substring(end - max, end);
    }
}