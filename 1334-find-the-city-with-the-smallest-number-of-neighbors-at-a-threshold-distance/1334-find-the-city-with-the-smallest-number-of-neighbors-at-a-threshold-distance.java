class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int INF = (int) 1e9 + 7;
        List<List<int[]>> al = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            al.add(new ArrayList<int[]>());
        }
        
        for(int x[] : edges){
            al.get(x[0]).add(new int[]{x[1],x[2]});
            al.get(x[1]).add(new int[]{x[0],x[2]});
        }
        
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        
        for(int i=0; i<n; i++){
            solve(n, al, dist[i], i);
        }
        
         int minCity = -1;
        int minCount = n;
        
        for (int i = 0; i < n; i++) {
            int curCount = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {continue;}
                if (dist[i][j] <= distanceThreshold) {curCount++;}
            }
            if (curCount <= minCount) {
                minCount = curCount;
                minCity = i;
            }
        }
        
        return minCity;
        
        
        
    }
    
    
        void solve(int n, List<List<int[]>> al, int[] dist, int src) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        pq.add(new int[]{src, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.remove();
            int u = cur[0];
            int du = cur[1];
            if (du > dist[u]) {continue;}
            
            for (int[] nb : al.get(u)) {
                int v = nb[0];
                int duv = nb[1];
                if (dist[v] > du + duv) {
                    dist[v] = du + duv;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }
    }
}