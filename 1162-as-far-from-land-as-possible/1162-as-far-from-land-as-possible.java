class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int []>q=new LinkedList<>();
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count++;
                    q.add(new int []{i,j});
                }
            }
        }
        // ek bhi 1 nahi hai ya sara 1 hai tab nearest distance kya hi hoga
        if(count==0 || count==grid.length*grid[0].length) return -1;
        
        int level=-1;
        int dirs[][]={{-1,0},{0,-1},{1,0},{0,1}};
        
        while(q.size()>0){
            int size=q.size();
            level++;
            
            while(size-->0){
                // poll first element to run bfs
                int rem[]=q.poll();
                
                for(int i=0;i<4;i++){
                    int rd=rem[0]+dirs[i][0];
                    int cd=rem[1]+dirs[i][1];
                    
                    if(rd<0 || cd<0 || rd>=grid.length || cd>=grid[0].length || grid[rd][cd]==1) continue;
                    
                    q.add(new int[]{rd,cd});
                    grid[rd][cd]=1;
                }
                
            }
        }
        return level;
    }
}