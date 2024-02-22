import java.util.Arrays;

class Solution {
    int mod = (int) 1e9 + 7;
    int[][] dp = null;

    int helper(String s, String t, int i, int j) {
        if (j == t.length())
            return 1;

        if (i == s.length())
            return 0;
        
        if (dp[i][j] != -1)
            return dp[i][j];
        
        int incl = 0;
        if (s.charAt(i) == t.charAt(j))
            incl = helper(s, t, i + 1, j + 1);
        
        int excl = helper(s, t, i + 1, j);
        
        return dp[i][j] = (incl + excl) % mod;
    }
    
    int subsequenceCount(String s, String t) {
        dp = new int[s.length()][t.length()];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return helper(s, t, 0, 0);
    }
}
