//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

 class Solution {
    public int maxProfit(int n, int[] prices) {
        // int n = prices.length;
        int[][][] dp = new int[n + 1][2][3];

        for (int index = n - 1; index >= 0; index--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int limit = 1; limit <= 2; limit++) {
                    if (buy == 1) {
                        int buyit = -prices[index] + dp[index + 1][0][limit];
                        int skip = 0 + dp[index + 1][1][limit];
                        dp[index][buy][limit] = Math.max(buyit, skip);
                    } else {
                        int sell = prices[index] + dp[index + 1][1][limit - 1];
                        int skip = 0 + dp[index + 1][0][limit];
                        dp[index][buy][limit] = Math.max(sell, skip);
                    }
                }
            }
        }

        return dp[0][1][2];
    }
    
    
}
        
