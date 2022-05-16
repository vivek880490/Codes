class Solution {
    public boolean isPossible(int[] nums) {
     
        HashMap<Integer,Integer> fm = new HashMap<>();
        for(int x : nums){
            fm.put(x, fm.getOrDefault(x,0)+1);
        }
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(fm.get(nums[i]) == 0) continue;
            
            if(hm.getOrDefault(nums[i],0) > 0){
                fm.put(nums[i], fm.get(nums[i])-1);
                hm.put(nums[i], hm.getOrDefault(nums[i],0)-1);
                hm.put(nums[i]+1, hm.getOrDefault(nums[i]+1,0)+1);
            }
            else if(fm.getOrDefault(nums[i],0)>0 && fm.getOrDefault(nums[i]+1,0) > 0 &&
                   fm.getOrDefault(nums[i]+2,0)>0){
                fm.put(nums[i],fm.get(nums[i])-1);
                fm.put(nums[i]+1,fm.get(nums[i]+1)-1);
                fm.put(nums[i]+2,fm.get(nums[i]+2)-1);
                
                hm.put(nums[i]+3, hm.getOrDefault(nums[i]+3,0)+1);
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}