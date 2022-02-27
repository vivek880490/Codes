class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1 ){
                    if(grid[i][j]==1){
                    dfs(grid,i,j);
                }
                }
            }
        }
        
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count++;
                }
                
            }
         }
        return count;
        
        
    }
    int dirs[][]={{0,-1},{-1,0},{0,1},{1,0}};
    void dfs(int grid[][],int r,int c){
        grid[r][c]=0;
        for(int i=0;i<4;i++){
            int rd=r+dirs[i][0];
            int cd=c+dirs[i][1];
            
            if(rd<0 || cd<0 || rd>=grid.length || cd>=grid[0].length || grid[rd][cd]==0){
                continue;
            }
            grid[rd][cd]=0;
            dfs(grid,rd,cd);
        }
        
    }
}