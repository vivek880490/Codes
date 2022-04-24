class Solution {
    public List<Integer> findLonely(int[] nums) {
        
       HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> ans = new ArrayList<>();
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        for(int x : map.keySet()){
            if(map.get(x) == 1 && (map.getOrDefault(x+1,0)== 0 && map.getOrDefault(x-1,0) == 0)){
                ans.add(x);
                
            }
        }
               
               return ans;
        
        
    }
}