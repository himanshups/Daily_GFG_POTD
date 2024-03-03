

//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        StringBuilder chand_mehman = new StringBuilder();
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String p,String q){
                String m = p+q;
                String n = q+p;
                return n.compareTo(m);
            }
        });
        for(String kon: arr) chand_mehman.append(kon);
        return chand_mehman.toString();
        
    }
}
