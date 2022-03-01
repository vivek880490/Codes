class Solution {
    public int[] countBits(int n) {
        
        int ans[]=new int[n+1];
        
        for(int i=0;i<=n;i++){
            ans[i]=solve(i);
        }
        return ans;
        
    }
    
    int solve(int i){
        int count=0;
        while(i!=0){
            int rmsb = i & -i;
            
            i = i-rmsb;
            count++;
        }
        return count;
    }
}