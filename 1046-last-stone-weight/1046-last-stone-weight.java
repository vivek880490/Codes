class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<stones.length; i++){
            pq.add(stones[i]);
        }
        
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            
            if(a == b) continue;
            
            else if(a != b){
                pq.add(Math.abs(b-a));
            }
        }
        
        if(pq.size() == 0) return 0;
        else return pq.peek();
        
    }
}