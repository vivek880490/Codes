class Solution {
    public int[] diStringMatch(String s) {
        
        
        int n = s.length();
        
        int ans[] = new int[n+1];
        
        int left = 0;
        int right = n;
        
        for(int i=0; i<n; i++){
            ans[i] = s.charAt(i)=='I'? left++ : right--;
            
        }
        ans[n] = left;
        
        return ans;
        
    }
}