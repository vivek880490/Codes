class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int max = 0;
        
        for(List<Integer> al : wall){
            int count = 0;
            for(int i=0; i<al.size()-1; i++){
                int num = al.get(i);
                count += num;
                map.put(count, map.getOrDefault(count,0)+1);
                max = Math.max(max, map.get(count));
            }
            
        }
        
        return wall.size()-max;
    }
}