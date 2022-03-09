class Solution {
    public int closedIsland(int[][] grid) {
        
        boolean vis[][] =  new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i == 0 && grid[i][j]==0 && vis[i][j] == false){
                    dfschange(grid,i,j,vis);
                }
                else if(j == 0 && grid[i][j]==0 && vis[i][j] == false){
                    dfschange(grid,i,j,vis);
                }
                else if(i == grid.length-1 && grid[i][j]==0 && vis[i][j] == false){
                    dfschange(grid,i,j,vis);
                }
                else if(j == grid[0].length-1 && grid[i][j]==0 && vis[i][j] == false){
                    dfschange(grid,i,j,vis);
                }
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                
                if(grid[i][j]==0 && vis[i][j] == false){
                    dfschange(grid,i,j,vis);
                    count++;
                }
                
            }
        }
        return count;
        
        
    }
    
    void dfschange(int grid[][], int i, int j, boolean vis[][]){
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || vis[i][j] == true || grid[i][j]==1){
            return;
        }
        
        vis[i][j]=true;
        grid[i][j]=1;
        
        dfschange(grid,i+1,j,vis);
        dfschange(grid,i,j+1,vis);
        dfschange(grid,i-1,j,vis);
        dfschange(grid,i,j-1,vis);
        
        
    }
}