class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
       HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        int ans[] = new int[nums.length];
        int i = 0;
        for(int x : nums){
            int count = 0;
            for(int key : map.keySet()){
                if(key < x){
                    count += map.get(key);
                }
            }
            ans[i] = count;
            i++;
        }
        
        return ans;
    }
    
    
}