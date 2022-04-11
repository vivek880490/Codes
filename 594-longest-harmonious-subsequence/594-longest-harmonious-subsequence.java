class Solution {
    public int findLHS(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int max = 0;
        for(int k : map.keySet()){
            if(map.containsKey(k+1)){
                int count = map.get(k+1);
                int temp = map.get(k) + count;
                
                max = Math.max(temp,max);
            }
        }
        
        return max;
    }
}