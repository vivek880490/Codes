class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int x : nums){
            if(map.containsKey(x+k)){
                count += map.get(x+k);
            }
            
            if(map.containsKey(x-k)){
                count += map.get(x-k);
            }
            
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        return count;
        
        
    }
}