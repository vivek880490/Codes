class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length == 2) return cost[0]+cost[1];
        if(cost.length == 1) return cost[0];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        
        for(int i=0; i<cost.length; i++){
            pq.add(cost[i]);
        }
        
        while(pq.size() > 2){
            int p1 = pq.poll();
            int p2 = pq.poll();
            
            sum += p1+p2;
            
            if(Math.min(p1 , p2) >= pq.peek()){
                pq.poll();
            }
        }
        
        while(pq.size() > 0) {
            sum += pq.poll();
        }
        return sum;
    }
}