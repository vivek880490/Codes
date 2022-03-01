class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int []>q=new LinkedList<>();
        
        int fresh=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                // sab rotten ko queue me daal denge
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        if(fresh==0 ) return 0;
        int time=-1;
        int dirs[][] = {{0,1},{1,0},{-1,0},{0,-1}};
        while(q.size()>0){
            int size=q.size();
            time++;
            while(size-->0){
               int rem[]= q.poll();
                
                for(int i=0;i<4;i++){
                    int rd = rem[0]+dirs[i][0];
                    int cd = rem[1]+dirs[i][1];
                    
                    if(rd>=0 && cd>=0 && rd<grid.length && cd<grid[0].length && grid[rd][cd]==1){
                    q.add(new int[]{rd,cd});
                    grid[rd][cd]=0;
                    fresh--;
                    }
                }
                
            }
        }
           
        if(fresh==0) return time;
        else return -1;
        
    }
}