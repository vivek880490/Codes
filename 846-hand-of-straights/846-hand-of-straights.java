class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x : hand){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : hand){
            pq.add(x);
        }
        
        while(pq.size() > 0){
            int rem = pq.poll();
            
            for(int j=1; j<groupSize; j++){
                if(pq.contains(rem+j) == false) return false;
                else pq.remove(rem+j);
            }
        }
        return true;
        
    }
}