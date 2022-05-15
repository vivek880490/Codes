class Solution {
    int count;
    public int numTilePossibilities(String s) {
        
        char c[] = s.toCharArray();
        boolean vis[] = new boolean[s.length()];
        Arrays.sort(c);
        solve(0,vis, c);
        return count;
    }
    
    void solve(int start, boolean vis[], char c[]){
        if(start == c.length) return;
        
        for(int i=0; i<c.length; i++){
            
            if(vis[i]) continue;
            if(i - 1 >= 0 && c[i] == c[i-1] && vis[i-1] == false) continue;
            count++;
            vis[i] = true;
            solve(start+1, vis, c);
            vis[i] = false;
}
    }
}