//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int maxSum(int N) {
        int[] dp = new int[N + 1];
        Arrays.fill(dp, 0);
        for (int n = 0; n <= N; n++) {
            dp[n] = Math.max(n, dp[n / 2] + dp[n / 3] + dp[n / 4]);
        }
        return dp[N];
    }
}
