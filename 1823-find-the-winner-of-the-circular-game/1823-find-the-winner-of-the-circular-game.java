class Solution {
    public int findTheWinner(int n, int k) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            al.add(i);
        }
        
        k = k-1;
        
        int index = 0;
        
        return solve(al, k, index);
        
    }
    
    int solve(ArrayList<Integer> al, int k, int index){
        
        if(al.size() == 1){
            return al.get(0);
        }
        
        index = (index + k) % al.size();
        
        al.remove(index);
        
        solve(al, k, index);
        
        return al.get(0);
    }
    
    
    
}