class Solution {
    
    
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // add first row 1 
        List<Integer> al = new ArrayList<>();
        
        al.add(1);
        
        ans.add(al);
        
        for(int i=1; i<n; i++){
            
            List<Integer> bl = new ArrayList<>();
            // har baar har row ke liye first me 1 
            bl.add(1); 
            
            for(int j=1; j<i; j++){
                int left = ans.get(i-1).get(j-1);
                int right = ans.get(i-1).get(j);
                
                bl.add(left+right);
            }
            // har baar har row ke liye last me 1
            bl.add(1);
            ans.add(bl);
        }
        
        return ans;
        
        
    }
}