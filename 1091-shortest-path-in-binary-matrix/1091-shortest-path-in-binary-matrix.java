class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        if(grid[0][0]==1) return -1;
        
        int m=grid.length;
        int n=grid[0].length;
        
        Queue<int[]>q=new LinkedList<>();
        // add starting posn
        q.add(new int[]{0,0,1});
        //mark starting position visited
        grid[0][0]=1;
        int dirs[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
        while(q.size()>0){
            int size=q.size();
            
            while(size-->0){
                int rem[]=q.poll();
                
                if(rem[0]==m-1 && rem[1]==n-1) return rem[2];
                
                for(int dir[]:dirs){
                    int r=rem[0]+dir[0];
                    int c=rem[1]+dir[1];
                    
                    if(r>=0 && c>=0 && r<m && c<n && grid[r][c]==0){
                        q.add(new int[]{r,c,rem[2]+1});
                        grid[r][c]=1;
                    }
                }
                
                
            }
        }
        return -1;
        
        
        
        
        
    }
}