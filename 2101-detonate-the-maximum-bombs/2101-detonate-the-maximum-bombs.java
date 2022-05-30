class Solution {
    int count = 0;
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            count = 0;
            solve(i, new boolean[n], bombs);
            ans = Math.max(ans, count);
        }
        return ans;
        }
    
    void solve(int idx, boolean vis[], int bombs[][]){
        count++;
        vis[idx] = true;
        
        int n = bombs.length;
        
        for(int i=0; i<n; i++){
            if(vis[i] == false && inrange(bombs[idx],bombs[i])){
                vis[i] = true;
                solve(i, vis, bombs);
            }
        }
    } 
    
    boolean inrange(int a[], int b[]){
        long dx = a[0] - b[0];
        long dy = a[1] - b[1];
        long r = a[2];
        
        return dx * dx + dy * dy <= r * r;
            
    }
    
    
}