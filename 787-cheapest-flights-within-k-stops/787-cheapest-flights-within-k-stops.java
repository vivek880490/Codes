class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        List<List<int[]>> al = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            al.add(new ArrayList<int[]>());
        }
        
        for(int x[] : flights){
            al.get(x[0]).add(new int[]{x[1],x[2]});
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[1] - b[1]));

        pq.add(new int[]{src,0,-1});
        
        int stop[] = new int[n];
        Arrays.fill(stop, Integer.MAX_VALUE);
        
        
        while(pq.size() > 0){
            int rem[] = pq.poll();
            
            if(rem[2] > k || stop[rem[0]] < rem[2]) continue;
            
            stop[rem[0]] = rem[2];
            
            
            if(rem[0] == dst) return rem[1];
            
            
            for(int x[] : al.get(rem[0])){
                pq.add(new int[]{x[0], x[1] + rem[1], rem[2]+1});
            }
            
        }
        
        return -1;
        
        
        
    }
}