class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>>al=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        
        solve(nums,al,temp);
        return al;
    }
    
    void solve(int nums[],List<List<Integer>>al,List<Integer>temp){
        if(temp.size()==nums.length){
            al.add(new ArrayList<>(temp));
        }
        
       for(int i=0;i<nums.length;i++){
           if(temp.contains(nums[i])) continue;
           temp.add(nums[i]);
           solve(nums,al,temp);
           temp.remove(temp.size()-1);
       }
    }
}