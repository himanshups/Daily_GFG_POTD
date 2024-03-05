//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
        
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    int maxIndexDiff(int a[], int n) 
    { 
        // Your code here
        vector <int> right_arr(n);
        right_arr[n-1]=a[n-1];
        // store right most max element in array
        for(int i = n-2;i>=0;i--) right_arr[i]=max(a[i],right_arr[i+1]);
        int i = 0,j=0,ans = INT_MIN;
        // take ans as min index
        while(i<n and j<n){
            if(a[i]<=right_arr[j]) {
                ans = max(ans,j-i);
                j++;
            }
            else i++;
            
        }
        return ans;
    }
};

//{ Driver Code Starts.
  
/* Driver program to test above functions */
int main() 
{
    int T;
    //testcases
    cin>>T;
    while(T--){
        int num;
        //size of array
        cin>>num;
        int arr[num];
        
        //inserting elements
        for (int i = 0; i<num; i++)
            cin>>arr[i];
        Solution ob;
        
        //calling maxIndexDiff() function
        cout<<ob.maxIndexDiff(arr, num)<<endl;    
        
    }
    return 0;
} 
// } Driver Code Ends
