class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int len=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
              sum+=-1;
            }
            else {
                sum+=1;
            }
            if(map.containsKey(sum)){
               len=Math.max(len,i-map.get(sum));
            }
            else{
            map.put(sum,i);
            }
            
                
            
        }
        return len;
    }
}