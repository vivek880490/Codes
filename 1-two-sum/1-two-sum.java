class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            int x=target-nums[i];
            if(map.containsKey(x)){
                ans[0]=i;
                ans[1]=map.get(x);
            }
            else{
                map.put(nums[i],i);
            }
        }
               
               return ans;
               }
               }