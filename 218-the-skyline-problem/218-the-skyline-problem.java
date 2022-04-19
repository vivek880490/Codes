class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        
        List<int[]> al = new ArrayList<>();
        
        for(int i=0; i<buildings.length; i++){
            
            int l = buildings[i][0];
            int r = buildings[i][1];
            int h = buildings[i][2];
            
            al.add(new int[]{l, -h});
            al.add(new int[]{r, h});
        }
        
        Collections.sort(al,(a,b)->(a[0]==b[0]?a[1]-b[1]:a[0]-b[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         List<List<Integer>> ans = new ArrayList<>();
        
        int cht = 0;
        pq.add(0);
        
        for(int i=0; i<al.size(); i++){
            
            int rem[] = al.get(i);
            int x = rem[0];
            int ht = rem[1];
            
            
            if(ht < 0){
              pq.add(-ht);  
            }
            else{
                pq.remove(ht);
            }
            
            if(cht != pq.peek()){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(pq.peek());
                
                ans.add(temp);
                cht = pq.peek();
            }
            
        }
        return ans;
    }
}