class Solution {
    public int minCostConnectPoints(int[][] points) {
        
        int n = points.length;
        boolean vis[] = new boolean[n];
        
        int edge = n-1;
        int ans = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[2]-b[2]));
        
        int [] x = points[0];
        
        for(int i=1; i<n; i++){
            int y[] = points[i];
            
            int cost = Math.abs(x[0]-y[0]) + Math.abs(x[1]-y[1]);
            
            pq.add(new int[]{0,i,cost});
        }
        
        vis[0] = true;
        
        while(pq.size() > 0  && edge > 0){
            int rem[] = pq.poll();
            
            
            if(vis[rem[1]] == false){
                ans += rem[2];
                vis[rem[1]] = true;
            
            
            for(int i=0; i<n; i++){
                if(vis[i] == false){
                    int cost = Math.abs(points[rem[1]][0] - points[i][0]) + Math.abs(points[rem[1]][1] - points[i][1]);
                    pq.add(new int[]{rem[1], i, cost});
                }
            }
                edge--;
            }
            
        }
        
        return ans;
        
    }
}