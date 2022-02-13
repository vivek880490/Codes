class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res=new ArrayList();
        List<Integer>al=new ArrayList<>();
        
        solve(res,al,0,nums);
        return res;
        
    }
    void solve(List<List<Integer>>res,List<Integer>al,int i,int arr[]){
        if(i>=arr.length){
            res.add(new ArrayList<>(al));
            return;
        }
        
        al.add(arr[i]);
        solve(res,al,i+1,arr);
        
        al.remove(al.size()-1);
        solve(res,al,i+1,arr);
    }
}