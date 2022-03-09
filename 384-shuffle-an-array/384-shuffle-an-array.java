class Solution {
    
    int a[];
    int c[];

    public Solution(int[] nums) {
        int k = nums.length;
        int p = 0;
        
        a= new int[k];
        c= new int[k];
        
        for(int i:nums){
            a[p] = i;
            c[p] = i;
            p++;
        }
        
    }
    
    public int[] reset() {
        
        return a;
        
    }
    
    public int[] shuffle() {
        
        int k = c.length;
        
        while(k>0){
            
            int p = (int)(Math.random()*k);
            
            int d = c[k-1];
            c[k-1] = c[p];
            c[p] = d;
            k--;
        }
        
        return c;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */