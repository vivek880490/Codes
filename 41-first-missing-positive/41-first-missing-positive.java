class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums[0]==1 && nums.length==1) return 2; 
        
        Arrays.sort(nums);
        int minp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                minp=nums[i];
                break;
            }
        }
        
        int maxp=nums[nums.length-1];
        
        if(maxp<=0) return 1;
        if(minp!=1) return 1;
        
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=maxp<=nums.length?nums.length:maxp;
        for(int i=1;i<=k;i++){
            if(set.contains(i)==false){
                return i;
            }
        }
        
        return maxp+1 ;
        
    }
}