class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        
        if(grid==null || grid.length==0) return null;
        
        dfs(grid,row,col,grid[row][col]);
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    grid[i][j]=color;
                }
            }
        }
        return grid;
        
    }
    int dirs[][]={{0,1},{0,-1},{-1,0},{1,0}};
    void dfs(int grid[][],int r,int c,int color){
        //aate hi visisted bana do just negative daal ke
        grid[r][c]=-color;
        int count=0;
        
        // 4 direction me dekho
        
        for(int i=0;i<4;i++){
            int rd=r+dirs[i][0];
            int cd=c+dirs[i][1];
            
            if(rd<0 || cd<0 || rd>=grid.length || cd>=grid[0].length || Math.abs(grid[rd][cd])!=color){
                continue;  
            }
        
        count++;
        
        if(grid[rd][cd]==color){
            dfs(grid,rd,cd,color);
        }
        }
        
        if(count==4){
            grid[r][c]=color;
        }
        
        
    }
}