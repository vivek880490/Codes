class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        int m = grid[0].length;
        
        if(grid[0][0] == 1 ) return -1;
        
        Queue<int[]>  q = new LinkedList<>();
        
        q.add(new int[]{0,0,1});
        
        grid[0][0] = 1;
        
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0},{-1,-1},{1,1},{1,-1},{-1,1}};
        
        while(q.size() > 0){
            int rem[] = q.poll();
            
            if(rem[0] == n-1 && rem[1] == m-1) return rem[2];
            
            
            for(int i=0; i<8; i++){
                int dx = rem[0]+dirs[i][0];
                int dy = rem[1]+dirs[i][1];
                
                if(dx >= 0 && dy >=0 && dx < grid.length && dy < grid[0].length && grid[dx][dy] == 0){
                    grid[dx][dy] = 1;
                    q.add(new int[]{dx,dy,rem[2]+1});
                }
            }
        }
        
        return -1;
        
    }
}