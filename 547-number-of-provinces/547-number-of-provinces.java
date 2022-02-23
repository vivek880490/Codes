class Solution {
    public int findCircleNum(int[][] nums) {
        
        boolean vis[]=new boolean[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(vis[i]==false){
            dfs(nums,i,vis);
            count++;
        }
        }
        return count;
    }
    
    void dfs(int nums[][],int i,boolean vis[]){
        for(int j=0;j<nums.length;j++){
            if(nums[i][j]==1 && vis[j]==false){
                vis[j]=true;
                dfs(nums,j,vis);
            }
        }
    }
        
        
        
    
}