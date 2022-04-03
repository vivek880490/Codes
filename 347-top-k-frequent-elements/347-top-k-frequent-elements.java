class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->(a[1]==b[1]?a[0]-b[0]:a[1]-b[1]));
         for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
       for(int key : map.keySet()){
          pq.add(new int[]{key, map.get(key)});
          if(pq.size() > k){
              pq.poll();
          }
       }
       
       int ans[] = new int[k];
       int j = 0;
       while(pq.size() > 0){
           int rem[] = pq.poll();
           ans[j] = rem[0];
           j++;
       }
       
       return ans;
    }
}