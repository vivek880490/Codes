class Solution {
    
   
    public String reorganizeString(String S) {
     
       Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            int count = map.getOrDefault(c, 0) + 1;
          
            if (count > (S.length() + 1) / 2) return "";
            map.put(c, count);
        }
        // Greedy: fetch char of max count as next char in the result.
        // Use PriorityQueue to store pairs of (char, count) and sort by count DESC.
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (char c : map.keySet()) {
            q.add(new int[] {c, map.get(c)});
        }
        
        StringBuilder sb=new StringBuilder();
        
        int [] block=q.poll();
        sb.append((char)block[0]);
        block[1]--;
        
        while(q.size()>0){
            int [] temp=q.poll();
            sb.append((char)temp[0]);
            temp[1]--;
            
            if(block[1]>0){
                q.add(block);
                
            }
            block=temp;
            
        }
        if(block[1]>0) return "";
        
        return sb.toString();
        
    }
}