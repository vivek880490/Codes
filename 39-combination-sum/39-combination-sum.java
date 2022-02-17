class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int k) {
        
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        
        solve(0,arr,k,ans,al);
        
        return ans;
    }
    
    void solve(int i,int arr[],int k,List<List<Integer>> ans,List<Integer> al){
        if(i==arr.length){
            if(k==0){
                ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(arr[i]<=k){
            al.add(arr[i]);
            solve(i,arr,k-arr[i],ans,al);
            al.remove(al.size()-1);
        }
        
        
        solve(i+1,arr,k,ans,al);
        
        
    }
}