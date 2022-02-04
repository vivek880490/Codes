class Solution 
{
    int[][] trav= {{-1,0},{0,1},{1,0},{0,-1}};
    public int shortestBridge(int[][] grid) 
    {
        Queue<int[]> q= new LinkedList<>();
        boolean flag= false;
        for(int i= 0; i< grid.length; i++)
        {
            for(int j= 0; j< grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    dfs(grid, i, j, q);//Connected island cells 
                    flag= true;
                    break;
                }
            }
            if(flag == true)break;
        }
        
        return findNearestIslandBFS(grid, q);
    }
    
    private void dfs(int[][] grid, int i, int j, Queue<int[]> q)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1 || grid[i][j] == 0)
            return; 
        
        grid[i][j]= -1;
        q.offer(new int[]{i, j});
        
        
        dfs(grid, i-1, j, q);
        dfs(grid, i, j+1, q);
        dfs(grid, i+1, j, q); 
        dfs(grid, i, j-1, q);
        
        return;
    }
    
    private int findNearestIslandBFS(int[][] grid, Queue<int[]> q)
    {
        
        
        int level= 0;
        
        while(!q.isEmpty())
        {
            int size= q.size();
            while(size-- > 0)
            {
                int []temp= q.poll();
                for(int []dirc: trav)
                {
                   
                    int dx= temp[0]+ dirc[0];
                    int dy= temp[1]+ dirc[1];
                    if(dx >= grid.length || dx < 0 || dy >= grid[0].length || dy < 0 || grid[dx][dy] == -1)
                        continue;
                    
                    if(grid[dx][dy] == 1)//when we find a island cell, we return the current level
                        return level;
                    
                    else
                    {
                        grid[dx][dy]= -1;
                        q.offer(new int[]{dx, dy});
                    }
                }
            }
            level+= 1;
        }
        return -1;
    }
}