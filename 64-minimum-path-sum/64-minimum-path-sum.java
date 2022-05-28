class Solution {
    public int minPathSum(int[][] grid) {
        
        
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[2]-b[2]));
       
       pq.add(new int[]{0,0,grid[0][0]});
       
       boolean vis[][] = new boolean[grid.length][grid[0].length];
       
       while(pq.size() > 0){
           int rem[] = pq.poll();
           
           int x = rem[0];
           int y = rem[1];
           int w = rem[2];
           
           if(vis[x][y] == true) continue;
           
           if(x == grid.length-1 && y == grid[0].length-1) return w;
           vis[x][y] = true;
           
           int dirs[][] = {{0,1},{1,0}};
           
           for(int k=0; k<2; k++){
               
               int dx = x + dirs[k][0];
               int dy = y + dirs[k][1];
               
               if(dx >=0 && dy >=0 && dx < grid.length && dy < grid[0].length){
                   pq.add(new int[]{dx,dy,w+grid[dx][dy]});
               }
           }
        
       }
       
       return -1;
    }
}