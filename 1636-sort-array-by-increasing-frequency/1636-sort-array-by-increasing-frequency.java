class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] == b[1] ? b[0]-a[0] : a[1] - b[1]);
        
        for(int k : nums){
            pq.add(new int[]{k, map.get(k)});
        }
        
        int ans[] = new int[nums.length];
        
        int i = 0;
        
        while(pq.size() > 0){
            int rem[] = pq.poll();
            ans[i] = rem[0];
            i++;
        }
        
        return ans;
    }
}