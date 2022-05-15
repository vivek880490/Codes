class Solution {
    public int maximumProduct(int[] nums, int k) {
        long m = 1000000007;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i=0; i<nums.length; i++){
            pq.add((long)nums[i]);
        }
        
        while(k --> 0){
            long rem = pq.poll();
            rem+=1;
            pq.add(rem);
        }
        
        long ans = 1;
        
        while(pq.size() > 0){
            long rem =pq.poll();
            ans = (ans*rem)%m;
        }
        
        return (int)(ans%m);
    }
}