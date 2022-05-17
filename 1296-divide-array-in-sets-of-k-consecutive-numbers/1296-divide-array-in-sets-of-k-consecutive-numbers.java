class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int x : nums){
            pq.add(x);
        }
        
        while(pq.size() > 0){
            int rem = pq.poll();
            for(int i=1; i<k; i++){
                if(pq.contains(rem+i) == false) return false;
                else pq.remove(rem+i);
            }
        }
        
        return true;
    }
}