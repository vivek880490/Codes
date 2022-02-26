class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>al=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(nums,0,al,temp);
        return al;
        
        
        
    }
    void solve(int nums[],int s,List<List<Integer>>al,List<Integer>temp){
        
        if(s>=nums.length){
            al.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[s]);
        solve(nums,s+1,al,temp);
        
        temp.remove(temp.size()-1);
        solve(nums,s+1,al,temp);
        
    }
}