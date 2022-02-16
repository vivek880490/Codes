class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        
        Queue<Map.Entry<Integer,Integer>>q=new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            q.add(entry);
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        while(ans.size()<k){
            Map.Entry<Integer,Integer>entry=q.poll();
            ans.add(entry.getKey());
        }
    
         int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}