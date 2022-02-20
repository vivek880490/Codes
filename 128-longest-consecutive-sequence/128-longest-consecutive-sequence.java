class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean>map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        
        int max=0;
        for(int k:map.keySet()){
            if(map.get(k)==true){
                int count=1;
                int n=k;
                while(map.containsKey(n+1)){
                    count++;
                    n=n+1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
        
        
        
    }
}