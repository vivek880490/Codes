class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        boolean vis [][] = new boolean[grid.length][grid[0].length];
        int max = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1 && vis[i][j] == false){
                    int area = dfs(grid, i, j, vis,0);
                    max = Math.max(area, max);
                }
            }
        }
        return max;
    }
    
    int dfs(int grid[][], int i, int j, boolean vis[][],int count){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0 || vis[i][j] ==true) return count;
        
        vis[i][j] = true;
        
        if(grid[i][j]==1)count++;
        
        count = dfs(grid, i+1, j, vis,count);
        count = dfs(grid, i, j+1, vis,count);
        count = dfs(grid, i-1, j, vis,count);
        count = dfs(grid, i, j-1, vis,count);
        
        return count;
    }
}