class Solution {
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        ArrayList<ArrayList<int[]>> al = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            al.add(new ArrayList<int[]>());
        }
        
        for(int x[] : times){
            al.get(x[0]).add(new int[]{x[1],x[2]});
        }
        
        boolean visited[] = new boolean[n+1];
        
        int ans = solve(al, visited, k);
        
        for(int i=1; i<=n; i++){
            if(visited[i] == false) return -1;
        }
        
        return ans;
    }
    
    int solve( ArrayList<ArrayList<int[]>>al, boolean visited[], int k){
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
        
        pq.add(new int[]{k,0});
        
        int mst = 0;
        
        while(pq.size() > 0){
            int rem[] = pq.poll();
            
            if(visited[rem[0]] == true) continue;
            visited[rem[0]] = true;
            
            mst = Math.max(mst, rem[1]);
            
            for(int x[] : al.get(rem[0])){
                
                pq.add(new int[]{x[0],x[1]+rem[1]});
            }
        }
        
        return mst;
    }
}