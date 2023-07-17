// Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Character>q = new LinkedList<>();
        StringBuilder s= new StringBuilder();
        for(int i = 0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            map.putIfAbsent(ch,0);
            map.put(ch,map.get(ch)+1);
            if(map.get(ch)==1) q.add(ch);
            while(q.size()!=0 && map.get(q.peek())>1)
                q.remove();
            if(q.size()==0) s.append('#');
            else s.append(q.peek());
        }
        return s.toString();
    }
}
