class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        
        boolean vis[][] = new boolean[maze.length][maze[0].length];
        
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{entrance[0], entrance[1]});
        
        vis[entrance[0]][entrance[1]] = true;
        
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int count = 0;
        
        while(q.size() > 0){
            
            int size = q.size();
            count++;
            
            while(size -->0 ){
                
                int rem[] = q.poll();
                

                
                for(int i=0; i<4; i++){
                    int dx = rem[0] + dirs[i][0];
                    int dy = rem[1] + dirs[i][1];
                    
                    if(dx < 0 || dy < 0 || dx >= maze.length || dy >= maze[0].length || maze[dx][dy] == '+' || vis[dx][dy] == true) continue;
                
                    if(dx == 0 || dx == maze.length-1 || dy == 0 || dy == maze[0].length-1) return count;
                    
                    q.add(new int[]{dx,dy});
                    vis[dx][dy]=true;
                }
            }
        }
        return -1;
        
    }
}