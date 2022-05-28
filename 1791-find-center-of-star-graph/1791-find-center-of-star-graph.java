class Solution {
    public int findCenter(int[][] edges) {
        
        int v = edges.length+1;
        
        List<List<Integer>> al = new ArrayList<>();
        
        for(int i=0; i<=v; i++){
            al.add(new ArrayList<>());
        }
        
        for(int x[] : edges){
            al.get(x[0]).add(x[1]);
            al.get(x[1]).add(x[0]);
        }
        
        for(int i=1; i<=v; i++){
            HashSet<Integer> set = new HashSet<>();
            
            set.add(i);
            for(int x : al.get(i)){
                set.add(x);
            }
            
            if(set.size() == v) return i;
        }
        
        return -1;
    }
}