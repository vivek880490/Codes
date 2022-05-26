class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[2]-b[2]));
        //boolean vis[][] = new boolean[r][c];
        pq.add(new int[]{0,0,0});
        //vis[0][0] = true;
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
        dist[0][0] = 0;
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int ans = 0;
        while(pq.size() > 0){
            int rem[] = pq.poll();
            //vis[rem[0]][rem[1]] = true;
            int x = rem[0];
            int y = rem[1];
            int d = rem[2];
            
            if(x == m-1 && y == n-1) return d;
            
            for(int i=0; i<4; i++){
                int dx = rem[0] + dirs[i][0];
                int dy = rem[1] + dirs[i][1];
                
                if(dx >= 0 && dy >= 0 && dx < m && dy < n){
                   int newDist = Math.max(d, Math.abs(heights[dx][dy] - heights[x][y]));
                    if (dist[dx][dy] > newDist) {
                        dist[dx][dy] = newDist;
                        pq.offer(new int[]{dx, dy, dist[dx][dy]});
                    }
                }
            }
        }
        return 0;
        
    }
}