class Solution {
    public int numIslands(char[][] grid) {
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        
        Queue<int[]> q = new LinkedList<>();
        
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] =='1' && vis[i][j] == false){
                    q.add(new int[]{i,j});
                    count++;
                    vis[i][j] = true;
             
        
        while(q.size() > 0){
            int rem[] = q.poll();
            
            for(int k=0; k<4; k++){
                int dx = rem[0] + dirs[k][0];
                int dy = rem[1] + dirs[k][1];
                
                
                if(dx >= 0 && dy >=0 && dx < grid.length && dy < grid[0].length && vis[dx][dy] == false && grid[dx][dy] == '1'){
                    vis[dx][dy] = true;
                    q.add(new int[]{dx,dy});
                }
                
            }
        }
                       }
            }
        }
        return count;
    }
}