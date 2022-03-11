class Solution {
    public int maxDistance(int[][] grid) {
        
        int count = 0;
        Queue<int []> q = new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    q.add(new int[]{i,j});
                    count++;
                }
            }
        }
        if(count == 0) return -1;
        if(count == grid.length*grid[0].length) return -1;
        
        int level = -1;
        int dirs[][]={{0,1},{1,0},{0,-1},{-1,0}};
        
        while(q.size() > 0){
            int size = q.size();
            level++;
            while(size-->0){
                int rem[] = q.poll();
                
                for(int i=0; i<4; i++){
                    int dx = dirs[i][0]+rem[0];
                    int dy = dirs[i][1]+rem[1];
                    
                    if(dx<0 || dy<0 || dx >= grid.length || dy >= grid[0].length || grid[dx][dy]==1) continue;
                    
                    
                    q.add(new int []{dx,dy});
                    grid[dx][dy]=1;
                    
                    
                    
                }
            }
        }
        
        return level;
    }
}