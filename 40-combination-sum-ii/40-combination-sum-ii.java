class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int x) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        ArrayList<Integer>temp=new ArrayList<Integer>();
        sum2(0,nums,x,ans,temp);
        return ans;
    }
    
    static void sum2(int p,int[]nums,int x,List<List<Integer>>ans, ArrayList<Integer>temp){
        if(x==0){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i=p;i<nums.length;i++){
            if(i>p && nums[i]==nums[i-1]) continue;
            if(nums[i]>x) break;
            
            temp.add(nums[i]);
            sum2(i+1,nums,x-nums[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}