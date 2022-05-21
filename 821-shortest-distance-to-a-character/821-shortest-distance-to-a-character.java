class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int ans[] = new int[s.length()];
        char ca[] = s.toCharArray();
        int distl = n;
        int distr = n;
        
        for(int i=0; i<n; i++){
            if(ca[i] == c){
                distl = 0;
            }
            ans[i] = distl;
            distl++;
        }
        
        for(int i=n-1; i>=0; i--){
            if(ca[i] == c){
                distr = 0;
            }
            ans[i] = Math.min(ans[i],distr);
            distr++;
        }
        
        return ans;
    }
}