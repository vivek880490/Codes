class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        int ans = 0;
        for(int k : map.keySet()){
            if(map.get(k) >= 2){
                int n = map.get(k);
                ans += n*(n-1)/2;
            }
        }
        return ans;
    }
}