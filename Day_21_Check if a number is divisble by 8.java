//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String word){
        int a = 0;
        if (word.length()<3) a = Integer.parseInt(word);
        else
        a =Integer.parseInt(word.substring(word.length() - 3));
        if(a%8==0) return 1;
        else return -1;
    }
}
