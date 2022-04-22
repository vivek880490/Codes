class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : tasks){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
        (a,b)->(a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue())
        
        );
        
        pq.addAll(map.entrySet());
        
        int count = 0;
        
        while(pq.size() > 0){
            int k = n+1;
            List<Map.Entry> temp = new ArrayList<>();
            
            while(k > 0 && pq.size() > 0){
                Map.Entry<Character, Integer> top = pq.poll();
                top.setValue(top.getValue()-1);
                temp.add(top);
                k--;
                count++;
            }
            
            for(Map.Entry<Character,Integer> e : temp){
                if(e.getValue() > 0){
                    pq.add(e);
                }
            }
            
            if(pq.size() == 0) break;
            
            count = count+k;
            
            
        }
        return count;
    }
}